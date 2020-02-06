<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:t6="XML_tim6"
                exclude-result-prefixes="xs"
                version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <style type="text/css">
                    .textCenter{
                    text-align: center;
                    }
                    .italic{
                    font-style: italic;
                    }
                    .textSize20{
                    font-size: 20px;
                    }
                    .textSize16{
                    font-size: 16px;
                    }
                    .abstractSection{
                    font-size: 16px;
                    font-weight: bold;
                    display: inline;
                    }
                    .abstractParagraph{
                    margin-block-start: 0;
                    margin-block-end: 0;
                    }
                    .top-margin{
                    margin-top: 20px;
                    }
                    .top-margin-sm{
                    margin-top: 10px;
                    }
                    .figure-image{
                    max-width:400px;
                    margin:auto;
                    text-align:center;
                    }
                    .figure-table{
                    text-align:center;
                    }

                    .quote-source{
                    text-align:right;
                    font-style:italic
                    }


                </style>
            </head>
            <body>
                <div style="margin-left:10%; margin-right:10%; text-align:justify;">
                    <h1 class="textCenter"><xsl:value-of select="t6:paper/@title"/></h1>
                    <xsl:apply-templates select="/t6:paper/t6:authors"/>
                    <xsl:apply-templates select="/t6:paper/t6:abstract"/>
                    <xsl:apply-templates select="/t6:paper/t6:content"/>
                    <xsl:apply-templates select="/t6:paper/t6:references"/>
                    <xsl:apply-templates select="/t6:paper/t6:citations"/>
                    <xsl:apply-templates select="/t6:paper/t6:notes"/>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template  match="/t6:paper/t6:authors">
        <xsl:for-each select="t6:author">
            <div class="textCenter textSize20" >
                <xsl:value-of select="t6:personal/t6:first_name"/>
                <xsl:text> </xsl:text>
                <xsl:value-of select="t6:personal/t6:middle_name"/>
                <xsl:text> </xsl:text>
                <xsl:value-of select="t6:personal/t6:last_name"/>
            </div>
            <div class="italic textCenter textSize16">
                <xsl:value-of select="t6:institution/t6:name"/>
                <xsl:text>, </xsl:text>
                <xsl:value-of select="t6:institution/t6:city"/>
                <xsl:text>, </xsl:text>
                <xsl:value-of select="t6:institution/t6:country"/>
            </div>
        </xsl:for-each>
    </xsl:template>

    <xsl:template match="t6:abstract">
        <div id="{current()/@id}">
            <h2>Abstract</h2>
            <p class = "abstractParagraph" id="{t6:purpose/@id}">
                <span class="abstractSection">Purpose - </span>
                <xsl:value-of select="t6:purpose"/>
            </p>
            <p class = "abstractParagraph" id="{t6:methodology/@id}">
                <span class="abstractSection">Methodology - </span>
                <xsl:value-of select="t6:methodology"/>
            </p>
            <p class = "abstractParagraph" id="{t6:findings/@id}">
                <span class="abstractSection">Findings - </span>
                <xsl:value-of select="t6:findings"/>
            </p>
            <p class = "abstractParagraph" id="{t6:research_implications/@id}">
                <span class="abstractSection">Research implications - </span>
                <xsl:value-of select="t6:research_implications"/>
            </p>
            <p class = "abstractParagraph" id="{t6:practical_implications/@id}">
                <span class="abstractSection">Practical implications - </span>
                <xsl:value-of select="t6:practical_implications"/>
            </p>
            <p class = "abstractParagraph" id="{t6:orginality/@id}">
                <span class="abstractSection">Orginality - </span>
                <xsl:value-of select="t6:orginality"/>
            </p>
            <p class = "abstractParagraph" id="{t6:keywords/@id}">
                <span class="abstractSection">Keywords - </span>
                <xsl:for-each select="t6:keywords/t6:keyword">
                    <xsl:value-of select="text()"/>
                    <xsl:if test="not(last() = position())">, </xsl:if>
                </xsl:for-each>
            </p>
        </div>
    </xsl:template>

    <xsl:template match="t6:content">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="t6:content//t6:section">
        <xsl:choose>
            <xsl:when test="@level=1">
                <h2 id="{current()/@id}"><xsl:value-of select="@title"/></h2>
            </xsl:when>
            <xsl:when test="@level=2">
                <h3 id="{current()/@id}"><xsl:value-of select="@title"/></h3>
            </xsl:when>
            <xsl:otherwise>
                <h4 id="{current()/@id}"><xsl:value-of select="@title"/></h4>
            </xsl:otherwise>
        </xsl:choose>
        <div class="top-margin"><xsl:apply-templates/></div>
    </xsl:template>

    <xsl:template match="t6:content//t6:quote">
        <div class="top-margin" style="max-width:70%; margin-left:20%; margin-right:20%;" id="{current()/@id}">
            <div class="textCenter"><q ><xsl:value-of select="text()"/></q></div>
            <div class="quote-source">
                <xsl:value-of select="@attributed_to"/> -
                <xsl:value-of select="@source"/>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="t6:paragraph">
        <p id="{current()/@id}"><xsl:apply-templates /></p>
    </xsl:template>

    <xsl:template match="t6:paragraph//t6:bold">
        <b><xsl:apply-templates /></b>
    </xsl:template>

    <xsl:template match="t6:paragraph//text()">
        <xsl:copy-of select="." />
    </xsl:template>

    <xsl:template match="t6:paragraph//t6:italic">
        <i><xsl:apply-templates /></i>
    </xsl:template>

    <xsl:template match="t6:section//t6:image">
        <div class="figure-image">
            <img src="{current()/@src}" alt="" width = "400px" id="{current()/@id}"></img>
            <div class="top-margin-sm"><xsl:value-of select="@title"/></div>
        </div>
    </xsl:template>

    <xsl:template match="t6:section//t6:list">
        <xsl:if test ="@type = 'ordered'">
            <ol id="{current()/@id}">
                <xsl:for-each select="t6:list_item">
                    <li><xsl:value-of select="text()"/></li>
                </xsl:for-each>
            </ol>
        </xsl:if>
        <xsl:if test ="@type = 'unordered'">
            <ul id="{current()/@id}">
                <xsl:for-each select="t6:list_item">
                    <li><xsl:value-of select="text()"/></li>
                </xsl:for-each>
            </ul>
        </xsl:if>
    </xsl:template>

    <xsl:template match="t6:section//t6:code">
        <div style="text-align:center" class="top-margin">
            <code id="{current()/@id}"><xsl:value-of select="text()"/></code>
            <div class="top-margin-sm"><xsl:value-of select="@title"/></div>
        </div>
    </xsl:template>

    <xsl:template match="t6:section//t6:formula">
        <div style="text-align:center" class="top-margin">
            <div id="{current()/@id}"><xsl:value-of select="text()"/></div>
            <div class="top-margin-sm"><xsl:value-of select="@title"/></div>
        </div>
    </xsl:template>

    <xsl:template match="t6:section//t6:table">
        <div class="figure-table" >
            <table align="center" border="1" id="{current()/@id}"><xsl:apply-templates/></table>
            <div class="top-margin-sm"><xsl:value-of select="@title"/></div>
        </div>
    </xsl:template>

    <xsl:template match="t6:section//t6:row">
        <tr><xsl:apply-templates/></tr>
    </xsl:template>

    <xsl:template match="t6:section//t6:cell[not(@colspan) and not(@rowspan)]">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>

    <xsl:template match="t6:section//t6:cell[(@colspan) and not(@rowspan)]">
        <td colspan="{current()/@colspan}">
            <xsl:apply-templates/>
        </td>
    </xsl:template>

    <xsl:template match="t6:section//t6:cell[not(@colspan) and (@rowspan)]">
        <td rowspan="{current()/@rowspan}">
            <xsl:apply-templates/>
        </td>
    </xsl:template>

    <xsl:template match="t6:section//t6:cell[(@colspan) and (@rowspan)]">
        <td colspan="{current()/@colspan}" rowspan="{current()/@rowspan}">
            <xsl:apply-templates/>
        </td>
    </xsl:template>

    <xsl:template match="t6:citations">
        <xsl:if test="count(t6:mention) != 0">
            <h4>This article is citing articles:  </h4>
            <xsl:for-each select="t6:mention">
                <div style="margin-bottom:10px">
                    <div id="{current()/@id}">[<xsl:value-of select="position()"/>]&#160;<xsl:apply-templates/> </div>
                    <div><xsl:apply-templates select="@location"/></div>
                </div>
            </xsl:for-each>
        </xsl:if>
    </xsl:template>

    <xsl:template match="t6:references">
        <xsl:if test="count(t6:mention) != 0">
            <h2>References:</h2>
            <xsl:for-each select="t6:mention">
                <div style="margin-bottom:10px">
                    <div>[<xsl:value-of select="position()"/>]&#160;<xsl:apply-templates/></div>
                    <div><xsl:apply-templates select="@location"/></div>
                </div>
            </xsl:for-each>
        </xsl:if>
    </xsl:template>

    <xsl:template match="@location">
        Link: <a href="{current()}"><xsl:value-of select="current()"/></a>
    </xsl:template>

    <xsl:template match="t6:mention">
        <xsl:apply-templates/>
        <xsl:value-of select="t6:work/t6:year_published" />&#160;
        <xsl:value-of select="t6:work/t6:title" />&#160;
        <xsl:value-of select="t6:work/t6:edition" />&#160;
        <xsl:value-of select="t6:work/t6:city" />&#160;
        <xsl:value-of select="t6:work/t6:publisher" />&#160;
        <xsl:value-of select="t6:work/t6:numbers" />
    </xsl:template>

    <xsl:template match="t6:mention/t6:authors">
        <xsl:for-each select="t6:author">
            <xsl:value-of select="t6:initial"/>&#160;
            <xsl:value-of select="t6:last_name"/>
            <xsl:if test="not(last() = position())">, </xsl:if>
        </xsl:for-each>
    </xsl:template>

    <xsl:template match="t6:notes">
        <h2 style="color:red">Notes</h2>
        <xsl:for-each select="t6:note">
            <div style="color:red">
                <a href = "#{current()/@ref_id}">
                    [<xsl:value-of select="position()"/>]
                </a>
                &#160;
                <xsl:apply-templates/>
            </div>
        </xsl:for-each>
    </xsl:template>

    <xsl:template match="t6:received | t6:revised | t6:accepted">
    </xsl:template>
</xsl:stylesheet>