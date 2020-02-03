<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:t6="XML_tim6" 
    xmlns:fo="http://www.w3.org/1999/XSL/Format" version="2.0">

    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="review_form">
                    <fo:region-body margin="1in"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="review_form">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block font-size="26pt" text-align="center">Review form</fo:block>
                    <xsl:apply-templates/>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

    <xsl:template match="t6:overview">
        <fo:block font-size="18pt" text-align="center" space-before="0.2in" space-after="0.2in" keep-with-next.within-page="always">Overview</fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.1in" space-after="0.1in"><xsl:apply-templates/></fo:block>
    </xsl:template>

    <xsl:template match="t6:positive_side">
        <fo:block font-size="18pt" text-align="center" space-before="0.2in" space-after="0.2in" keep-with-next.within-page="always">Positive side</fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.1in" space-after="0.1in"><xsl:apply-templates/></fo:block>
    </xsl:template>

    <xsl:template match="t6:major_remarks">
        <fo:block font-size="18pt" text-align="center" space-before="0.2in" space-after="0.2in" keep-with-next.within-page="always">Major remarks</fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.1in" space-after="0.1in"><xsl:apply-templates/></fo:block>
    </xsl:template>

    <xsl:template match="t6:minor_remarks">
        <fo:block font-size="18pt" text-align="center" space-before="0.2in" space-after="0.2in" keep-with-next.within-page="always">Minor remarks</fo:block>
        <fo:block font-size="10pt" text-align="justify" space-before="0.1in" space-after="0.1in"><xsl:apply-templates/></fo:block>
    </xsl:template>

    <xsl:template match="t6:paragraph">
        <fo:block font-size="10pt" text-align="justify" space-before="0.1in" space-after="0.1in"><xsl:apply-templates /></fo:block>
    </xsl:template>

    <xsl:template match="t6:paragraph//t6:bold">
        <fo:inline font-weight="bold" font-size="10pt"><xsl:apply-templates /></fo:inline>
    </xsl:template>
    
    <xsl:template match="t6:paragraph/text()">
        <fo:inline><xsl:copy-of select="." /></fo:inline>
    </xsl:template>
    
    <xsl:template match="t6:paragraph//t6:italic">
        <fo:inline font-style="italic" font-size="10pt"><xsl:apply-templates /></fo:inline>
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