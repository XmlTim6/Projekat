<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:t6="XML_tim6"
    exclude-result-prefixes="xs"
    version="2.0">

    <xsl:output indent="yes"/>

    <xsl:param name="otherFiles"/>

    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="/">
        <xsl:apply-templates select="t6:review_form"/>
    </xsl:template>

    <xsl:template match="t6:review_form">
        <xsl:copy>
            <xsl:apply-templates select="@*"/>
        
            <xsl:apply-templates select="t6:overview"/>
            <xsl:apply-templates select="t6:positive_side"/>
            <xsl:apply-templates select="t6:major_remarks"/>
            <xsl:apply-templates select="t6:minor_remarks"/>
            <xsl:for-each select="$otherFiles/t6:review_form">
                <xsl:apply-templates select="t6:overview"/>
                <xsl:apply-templates select="t6:positive_side"/>
                <xsl:apply-templates select="t6:major_remarks"/>
                <xsl:apply-templates select="t6:minor_remarks"/>
            </xsl:for-each>

        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>