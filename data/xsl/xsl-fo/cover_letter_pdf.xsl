<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:t6="XML_tim6" 
    xmlns:fo="http://www.w3.org/1999/XSL/Format" version="2.0">

    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="cover_letter">
                    <fo:region-body margin="1in"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="cover_letter">
                <fo:flow flow-name="xsl-region-body">
                    <xsl:apply-templates/>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

    <xsl:template match="t6:title">
        <fo:block font-size="26pt" text-align="center"><xsl:value-of select="text()"/></fo:block>
    </xsl:template>

    <xsl:template match="t6:submission_date">
    </xsl:template>

    <xsl:template match="t6:author">
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
    </xsl:template>

    <xsl:template match="t6:content">
        <fo:block font-size="10pt" text-align="justify" space-before="0.2in" space-after="0.2in">
            <xsl:apply-templates/>
        </fo:block>
    </xsl:template>

    <xsl:template match="t6:paragraph">
        <fo:block text-align="justify" space-before="0.1in" space-after="0.1in"><xsl:apply-templates /></fo:block>
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

    <xsl:template match="t6:list">
        <xsl:if test ="@type = 'ordered'">
            <fo:block space-before="0.15in">
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
            <fo:block space-before="0.15in">
                <xsl:for-each select="t6:list_item">
                    <fo:block>
                        <xsl:text>- </xsl:text>
                        <xsl:value-of select="text()"/>
                    </fo:block>
                </xsl:for-each>
            </fo:block>
        </xsl:if>
    </xsl:template>
    
</xsl:stylesheet>