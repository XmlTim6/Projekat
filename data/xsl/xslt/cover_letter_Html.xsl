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
                    .textSize20{
                        font-size: 20px;
                    }
                    .textSize16{
                        font-size: 16px;
                    }
                    .italic{
                        font-style: italic;
                    }
                </style>
            </head>
            <body>
                <div style="margin-left:10%; margin-right:10%; text-align:justify;">
                    <xsl:apply-templates/>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="t6:cover_letter/t6:title">
        <h1 class="textCenter"><xsl:value-of select="text()"/></h1>
    </xsl:template>

    <xsl:template match="/t6:cover_letter/t6:author">
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
    </xsl:template>

    <xsl:template match="/t6:cover_letter/t6:content">
        <xsl:apply-templates />
    </xsl:template>

    <xsl:template match="t6:paragraph">
        <p><xsl:apply-templates /></p>
    </xsl:template>

    <xsl:template match="t6:paragraph//t6:bold">
        <b><xsl:apply-templates /></b>
    </xsl:template>
    
    <xsl:template match="t6:paragraph/text()">
        <xsl:copy-of select="." />
    </xsl:template>
    
    <xsl:template match="t6:paragraph//t6:italic">
        <i><xsl:apply-templates /></i>
    </xsl:template>

    <xsl:template match="t6:list">
        <xsl:if test ="@type = 'ordered'">
            <ol>
                <xsl:for-each select="t6:list_item">
                    <li><xsl:value-of select="text()"/></li>
                </xsl:for-each>
            </ol>
        </xsl:if>
        <xsl:if test ="@type = 'unordered'">
            <ul>
                <xsl:for-each select="t6:list_item">
                    <li><xsl:value-of select="text()"/></li>
                </xsl:for-each>
            </ul>
        </xsl:if>
    </xsl:template>
    <xsl:template match="t6:submission_date">
    </xsl:template>

</xsl:stylesheet>