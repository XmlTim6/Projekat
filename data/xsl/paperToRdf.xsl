<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:rdf="http://www.w3.org/ns/rdfa#"
                xmlns:pred="http://www.tim6.rs/predicate/"
                xmlns:t6="XML_tim6"
                exclude-result-prefixes="xs"
                version="2.0">

    <xsl:output indent="yes" method="xml"/>

    <xsl:param name="paperLocation"/>

    <!-- IdentityTransform -->
    <xsl:template match="/ | @* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:paper">
        <xsl:copy>
            <xsl:namespace name="rdf" select="'http://www.w3.org/ns/rdfa#'"/>
            <xsl:namespace name="pred" select="'http://www.tim6.rs/predicate/'"/>
            <xsl:namespace name="xs" select="'http://www.w3.org/2001/XMLSchema#'"/>
            <xsl:attribute name="vocab">http://www.tim6.rs/predicate/</xsl:attribute>
            <xsl:attribute name="about"><xsl:value-of select = "$paperLocation" /></xsl:attribute>
            <xsl:attribute name="typeof">pred:Paper</xsl:attribute>
            <xsl:attribute name="property">pred:title</xsl:attribute>
            <xsl:attribute name="content"><xsl:value-of select="@title"/></xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:received">
        <xsl:copy>
            <xsl:attribute name="property">pred:received</xsl:attribute>
            <xsl:attribute name="datatype">xsd:date</xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:revised">
        <xsl:copy>
            <xsl:attribute name="property">pred:revised</xsl:attribute>
            <xsl:attribute name="datatype">xsd:date</xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:accepted">
        <xsl:copy>
            <xsl:attribute name="property">pred:accepted</xsl:attribute>
            <xsl:attribute name="datatype">xs:date</xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template  match="/t6:paper/t6:authors//t6:author">
        <xsl:copy>
            <xsl:attribute name="property">pred:author</xsl:attribute>
            <xsl:attribute name="content">
                <xsl:value-of select="t6:personal/t6:first_name"/> <xsl:text> </xsl:text>
                <xsl:value-of select="t6:personal/t6:middle_name"/> <xsl:text> </xsl:text>
                <xsl:value-of select="t6:personal/t6:last_name"/>
            </xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="/t6:paper/t6:authors/t6:author/t6:institution">
        <xsl:copy>
            <xsl:attribute name="property">pred:institution</xsl:attribute>
            <xsl:attribute name="content">
                <xsl:value-of select="t6:name"/> <xsl:text>, </xsl:text>
                <xsl:value-of select="t6:city"/> <xsl:text>, </xsl:text>
                <xsl:value-of select="t6:country"/>
            </xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="/t6:paper/t6:abstract/t6:keywords/t6:keyword">
        <xsl:copy>
            <xsl:attribute name="property">pred:keyword</xsl:attribute>
            <xsl:attribute name="datatype">xs:string</xsl:attribute>
            <xsl:apply-templates select="node() | @*"/>
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>