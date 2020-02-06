<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:t6="XML_tim6"
                xmlns:fo="http://www.w3.org/1999/XSL/Format" version="2.0">
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="paper">
                    <fo:region-body margin="1in"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="paper">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block text-align="center" font-size="26pt"><xsl:value-of select="t6:paper/@title"/></fo:block>
                    <xsl:apply-templates select="/t6:paper/t6:authors"/>
                    <xsl:apply-templates select="/t6:paper/t6:abstract"/>
                    <xsl:apply-templates select="/t6:paper/t6:content"/>
                    <xsl:apply-templates select="/t6:paper/t6:references"/>
                    <xsl:apply-templates select="/t6:paper/t6:citations"/>
                    <xsl:apply-templates select="/t6:paper/t6:notes"/>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

    <xsl:template  match="/t6:paper/t6:authors">
        <xsl:for-each select="t6:author">
            <fo:block text-align="center" font-size="12pt" space-before="0.05in">
                <fo:inline>
                    <xsl:value-of select="t6:personal/t6:first_name"/>
                    <xsl:text> </xsl:text>
                    <xsl:value-of select="t6:personal/t6:middle_name"/>
                    <xsl:text> </xsl:text>
                    <xsl:value-of select="t6:personal/t6:last_name"/>
                </fo:inline>
            </fo:block>
            <fo:block text-align="center" font-size="12pt">
                <fo:inline font-style="italic" >
                    <xsl:value-of select="t6:institution/t6:name"/>
                    <xsl:text>, </xsl:text>
                    <xsl:value-of select="t6:institution/t6:city"/>
                    <xsl:text>, </xsl:text>
                    <xsl:value-of select="t6:institution/t6:country"/>
                </fo:inline>
            </fo:block>
        </xsl:for-each>
    </xsl:template>

    <xsl:template match="t6:abstract">
        <fo:block font-size="18pt" space-before="0.2in" space-after="0.1in" >Abstract</fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in" id="{t6:purpose/@id}">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Purpose - </fo:inline>
            <xsl:value-of select="t6:purpose"/>
        </fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in" id="{t6:methodology/@id}">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Methodology - </fo:inline>
            <xsl:value-of select="t6:methodology"/>
        </fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Findings - </fo:inline>
            <xsl:value-of select="t6:findings"/>
        </fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in" id="{t6:research_implications/@id}">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Research implications - </fo:inline>
            <xsl:value-of select="t6:research_implications"/>
        </fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in" id="{t6:practical_implications/@id}">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Practical implications - </fo:inline>
            <xsl:value-of select="t6:practical_implications"/>
        </fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in" id="{t6:orginality/@id}">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Orginality - </fo:inline>
            <xsl:value-of select="t6:orginality"/>
        </fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.05in" id="{t6:keywords/@id}">
            <fo:inline font-style="italic" font-weight="bold" font-size="12pt">Keywords - </fo:inline>
            <xsl:for-each select="t6:keywords/t6:keyword">
                <xsl:value-of select="text()"/>
                <xsl:if test="not(last() = position())">, </xsl:if>
            </xsl:for-each>
        </fo:block>
    </xsl:template>

    <xsl:template match="t6:content//t6:section">
        <xsl:choose>
            <xsl:when test="@level=1">
                <fo:block keep-with-next.within-page="always" font-size="18pt" space-before="0.2in" space-after="0.1in" id="{current()/@id}"><xsl:value-of select="@title"/></fo:block>
            </xsl:when>
            <xsl:when test="@level=2">
                <fo:block keep-with-next.within-page="always" font-size="16pt" space-before="0.2in" space-after="0.1in" id="{current()/@id}"><xsl:value-of select="@title"/></fo:block>
            </xsl:when>
            <xsl:otherwise>
                <fo:block keep-with-next.within-page="always" font-size="14pt" space-before="0.2in" space-after="0.1in" id="{current()/@id}"><xsl:value-of select="@title"/></fo:block>
            </xsl:otherwise>
        </xsl:choose>
        <fo:block space-before="0.2in" font-size="10pt" space-after="0.2in"><xsl:apply-templates/></fo:block>
    </xsl:template>

    <xsl:template match="t6:content//t6:quote">
        <fo:block id="{current()/@id}"  space-before="0.2in" font-size="10pt" text-align="center">“<xsl:value-of select="text()"/>”</fo:block>
        <fo:block text-align="right" font-style="italic" font-size="10pt">
            <xsl:value-of select="@attributed_to"/> -
            <xsl:value-of select="@source"/>
        </fo:block>
    </xsl:template>

    <xsl:template match="t6:paragraph[not(parent::t6:cell)]">
        <fo:block id="{current()/@id}" text-align="justify" space-before="0.1in"><xsl:apply-templates /></fo:block>
    </xsl:template>

    <xsl:template match="t6:paragraph[parent::t6:cell]">
        <fo:block id="{current()/@id}" text-align="center" space-before="0.1in"><xsl:apply-templates /></fo:block>
    </xsl:template>

    <xsl:template match="t6:paragraph//t6:bold">
        <fo:inline font-weight="bold"><xsl:apply-templates /></fo:inline>
    </xsl:template>

    <xsl:template match="t6:paragraph/text()">
        <fo:inline><xsl:copy-of select="." /></fo:inline>
    </xsl:template>

    <xsl:template match="t6:paragraph//t6:italic">
        <fo:inline font-style="italic"><xsl:apply-templates /></fo:inline>
    </xsl:template>

    <xsl:template match="t6:section//t6:image">
        <fo:block text-align="center" space-before="0.2in" id="{current()/@id}">
            <fo:block keep-with-next.within-page="always">
                <fo:external-graphic src="url({current()/@src})" content-width="300pt" scaling="uniform"/>
            </fo:block>
            <fo:inline><xsl:value-of select="@title"/></fo:inline>
        </fo:block>
    </xsl:template>

    <xsl:template match="t6:list">
        <xsl:if test ="@type = 'ordered'">
            <fo:block space-before="0.15in" space-after="0.15in" id="{current()/@id}">
                <xsl:for-each select="t6:list_item">
                    <fo:block>
                        <xsl:value-of select="position()"/>
                        <xsl:text>. </xsl:text>
                        <xsl:value-of select="text()"/>
                    </fo:block>
                </xsl:for-each>
            </fo:block>
        </xsl:if>
        <xsl:if test ="@type = 'unordered'">
            <fo:block space-before="0.15in" space-after="0.15in" id="{current()/@id}">
                <xsl:for-each select="t6:list_item">
                    <fo:block>
                        <xsl:text>- </xsl:text>
                        <xsl:value-of select="text()"/>
                    </fo:block>
                </xsl:for-each>
            </fo:block>
        </xsl:if>
    </xsl:template>

    <xsl:template match="t6:table">
        <fo:table keep-with-next.within-page="always" keep-together.within-column="always" id="{current()/@id}">
            <fo:table-body>
                <xsl:apply-templates/>
            </fo:table-body>
        </fo:table>
        <fo:block text-align="center" space-before="0.1in"><xsl:value-of select="@title"/></fo:block>
    </xsl:template>

    <xsl:template match="t6:formula">
        <fo:block space-before="0.2in" text-align="center" keep-with-next.within-page="always" id="{current()/@id}" font-size="10pt">
            <xsl:value-of select="text()"/>
        </fo:block>
        <fo:block text-align="center" space-before="0.1in" font-size="10pt"><xsl:value-of select="@title"/></fo:block>
    </xsl:template>

    <xsl:template match="t6:code">
        <fo:block space-before="0.2in" text-align="center" keep-with-next.within-page="always" id="{current()/@id}" font-size="10pt">
            <xsl:value-of select="text()"/>
        </fo:block>
        <fo:block text-align="center" space-before="0.1in" font-size="10pt"><xsl:value-of select="@title"/></fo:block>
    </xsl:template>

    <xsl:template match="t6:row">
        <fo:table-row>
            <xsl:apply-templates/>
        </fo:table-row>
    </xsl:template>

    <xsl:template match="t6:cell[not(@colspan) and not(@rowspan)]">
        <fo:table-cell border="1px solid black" padding="2px">
            <fo:block text-align="center">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>

    <xsl:template match="t6:cell[(@colspan) and not(@rowspan)]">
        <fo:table-cell  number-columns-spanned="{current()/@colspan}" border="1px solid black" padding="2px">
            <fo:block text-align="center">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>

    <xsl:template match="t6:cell[not(@colspan) and (@rowspan)]">
        <fo:table-cell number-rows-spanned="{current()/@rowspan}" border="1px solid black" padding="2px">
            <fo:block text-align="center">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>

    <xsl:template match="t6:cell[(@colspan) and (@rowspan)]">
        <fo:table-cell number-rows-spanned="{current()/@rowspan}" number-columns-spanned="{current()/@colspan}" border="1px solid black" padding="2px">
            <fo:block text-align="center">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>

    <xsl:template match="t6:citations">
        <xsl:if test="count(t6:mention) != 0">
            <fo:block font-size="14pt" space-before="0.2in" space-after="0.1in" keep-with-next.within-page="always">This article has been cited by:</fo:block>
            <xsl:for-each select="t6:mention">
                <fo:block font-size="10pt" id="{current()/@id}">
                    [<xsl:value-of select="position()"/>]&#160;<xsl:apply-templates/>
                </fo:block>
                <fo:block font-size="10pt" space-before="0.05in" space-after="0.05in"><xsl:apply-templates select="@location"/></fo:block>
            </xsl:for-each>
        </xsl:if>
    </xsl:template>

    <xsl:template match="t6:references">
        <xsl:if test="count(t6:mention) != 0">
            <fo:block font-size="18pt" space-before="0.2in" space-after="0.1in" keep-with-next.within-page="always">References:</fo:block>
            <xsl:for-each select="t6:mention">
                <fo:block font-size="10pt">
                    [<xsl:value-of select="position()"/>]&#160;<xsl:apply-templates/>
                </fo:block>
                <fo:block font-size="10pt" space-before="0.05in" space-after="0.05in"><xsl:apply-templates select="@location"/></fo:block>
            </xsl:for-each>
        </xsl:if>
    </xsl:template>

    <xsl:template match="@location">
        Link:
        <fo:basic-link external-destination="url({current()})">
            <xsl:value-of select="current()"/>
        </fo:basic-link>
    </xsl:template>


    <xsl:template match="t6:mention">
        <xsl:apply-templates/>
        <fo:block font-size="10pt">
            <xsl:value-of select="t6:work/t6:year_published" />&#160;
            <xsl:value-of select="t6:work/t6:title" />&#160;
            <xsl:value-of select="t6:work/t6:edition" />&#160;
            <xsl:value-of select="t6:work/t6:city" />&#160;
            <xsl:value-of select="t6:work/t6:publisher" />&#160;
            <xsl:value-of select="t6:work/t6:numbers" />
        </fo:block>
    </xsl:template>

    <xsl:template match="t6:mention/t6:authors">
        <fo:inline font-size="10pt">
            <xsl:for-each select="t6:author">
                <xsl:value-of select="t6:initial"/>&#160;
                <xsl:value-of select="t6:last_name"/>
                <xsl:if test="not(last() = position())">, </xsl:if>
            </xsl:for-each>
        </fo:inline>
    </xsl:template>

    <xsl:template match="t6:notes">
        <fo:block>
            <fo:block font-size="14pt" space-after="0.05in" color="red">Notes</fo:block>
            <xsl:for-each select="t6:note">
                <fo:block color="red" font-size="10pt" space-after="0.15in">
                    <fo:basic-link internal-destination="{current()/@ref_id}">
                        <fo:inline color="blue" text-decoration="underline">[<xsl:value-of select="position()"/>]</fo:inline>
                    </fo:basic-link>
                    &#160;
                    <xsl:apply-templates/>
                </fo:block>
            </xsl:for-each>
        </fo:block>
    </xsl:template>

</xsl:stylesheet>