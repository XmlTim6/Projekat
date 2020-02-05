<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:t6="XML_tim6"
                exclude-result-prefixes="t6">
    <xsl:output omit-xml-declaration="yes" indent="yes"/>
    <xsl:strip-space elements="*"/>

    <xsl:param name="submitted"/>
    <xsl:param name="revised"/>
    <xsl:param name="accepted"/>

    <xsl:template match="/*/*[1]">
        <xsl:if test="string-length($submitted)!=0 and not(t6:paper/t6:received)">
            <received><xsl:value-of select = "$submitted" /></received>
        </xsl:if>
        <xsl:next-match />
    </xsl:template>

    <xsl:template match="t6:received">
        <xsl:next-match />
        <xsl:if test="string-length($revised)!=0 and not(t6:paper/t6:revised)">
            <revised><xsl:value-of select = "$revised" /></revised>
        </xsl:if>
        <xsl:if test="string-length($accepted)!=0 and not(t6:paper/t6:accepted)">
            <accepted><xsl:value-of select = "$accepted" /></accepted>
        </xsl:if>
    </xsl:template>

    <xsl:template match="t6:revised">
        <xsl:next-match />
        <xsl:if test="string-length($accepted)!=0 and not(t6:paper/t6:accepted)">
            <accepted><xsl:value-of select = "$accepted" /></accepted>
        </xsl:if>
    </xsl:template>

    <!-- IdentityTransform -->
    <xsl:template match="/ | @* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:image[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:code[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:formula[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:mention[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:section" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:paragraph" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:list[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:quote[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:table[not(@id)]" >
        <xsl:copy>
            <xsl:attribute name="id">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template name="t6:generateXPath" >
        <xsl:for-each select="ancestor::*">
            <xsl:if test="count(preceding-sibling::*[name()=name(current())])">
                <xsl:value-of select="concat(name(), count(preceding-sibling::*[name()=name(current())]) + 1, '/')" />
            </xsl:if>
            <xsl:value-of select="concat(name(), '/')" />
        </xsl:for-each>
        <xsl:if test="count(preceding-sibling::*[name()=name(current())])">
            <xsl:value-of select="concat(name(), count(preceding-sibling::*[name()=name(current())]) + 1, '/')" />
        </xsl:if>
        <xsl:value-of select="concat(name(), '/')" />
    </xsl:template>
</xsl:stylesheet>