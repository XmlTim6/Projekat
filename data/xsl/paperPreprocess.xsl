<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:t6="XML_tim6"
                exclude-result-prefixes="xs">
    <xsl:output indent="yes"/>

    <xsl:param name="submitted"/>
    <xsl:param name="revised"/>
    <xsl:param name="accepted"/>

    <xsl:template match="/">
        <xsl:apply-templates select="t6:paper"/>
    </xsl:template>

    <xsl:template match="t6:paper">
        <xsl:copy>
            <xsl:apply-templates select="@*"/>
            <xsl:choose>
                <xsl:when test="not(string-length($submitted)=0)">
                    <t6:received><xsl:value-of select = "$submitted" /></t6:received>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:if test="count(t6:received) = 1">
                        <t6:received><xsl:value-of select="t6:received/text()"/></t6:received>
                    </xsl:if>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:choose>
                <xsl:when test="not(string-length($revised)=0)">
                    <t6:revised><xsl:value-of select = "$revised" /></t6:revised>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:if test="count(t6:revised) = 1">
                        <t6:revised><xsl:value-of select="t6:revised/text()"/></t6:revised>
                    </xsl:if>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:choose>
                <xsl:when test="not(string-length($accepted)=0)">
                    <t6:accepted><xsl:value-of select = "$accepted" /></t6:accepted>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:if test="count(t6:accepted) = 1">
                        <t6:accepted><xsl:value-of select="t6:accepted/text()"/></t6:accepted>
                    </xsl:if>
                </xsl:otherwise>
            </xsl:choose>
<!--            <xsl:if test="not(string-length($submitted)=0)">-->
<!--                <xsl:choose>-->
<!--                    <xsl:when test="count(t6:received) = 0">-->
<!--                        <t6:received><xsl:value-of select = "$submitted" /></t6:received>-->
<!--                    </xsl:when>-->
<!--                    <xsl:otherwise>-->
<!--                        <xsl:choose>-->
<!--                            <xsl:when test="string-length($submitted)!=0">-->
<!--                                <t6:received><xsl:value-of select = "$submitted" /></t6:received>-->
<!--                            </xsl:when>-->
<!--                            <xsl:otherwise>-->
<!--                                <t6:received><xsl:value-of select="t6:received/text()"/></t6:received>-->
<!--                            </xsl:otherwise>-->
<!--                        </xsl:choose>-->
<!--                    </xsl:otherwise>-->
<!--                </xsl:choose>-->
<!--            </xsl:if>-->
<!--            <xsl:if test="not(string-length($revised)=0)">-->
<!--                <xsl:choose>-->
<!--                    <xsl:when test="count(t6:revised) = 0">-->
<!--                        <t6:revised><xsl:value-of select = "$revised" /></t6:revised>-->
<!--                    </xsl:when>-->
<!--                    <xsl:otherwise>-->
<!--                        <xsl:choose>-->
<!--                            <xsl:when test="string-length($revised)!=0">-->
<!--                                <t6:revised><xsl:value-of select = "$revised" /></t6:revised>-->
<!--                            </xsl:when>-->
<!--                            <xsl:otherwise>-->
<!--                                <t6:revised><xsl:value-of select="t6:revised/text()"/></t6:revised>-->
<!--                            </xsl:otherwise>-->
<!--                        </xsl:choose>-->
<!--                    </xsl:otherwise>-->
<!--                </xsl:choose>-->
<!--            </xsl:if>-->
<!--            <xsl:if test="not(string-length($accepted)=0)">-->
<!--                <xsl:choose>-->
<!--                    <xsl:when test="count(t6:accepted) = 0">-->
<!--                        <t6:accepted><xsl:value-of select = "$accepted" /></t6:accepted>-->
<!--                    </xsl:when>-->
<!--                    <xsl:otherwise>-->
<!--                        <xsl:choose>-->
<!--                            <xsl:when test="string-length($accepted)!=0">-->
<!--                                <t6:accepted><xsl:value-of select = "$accepted" /></t6:accepted>-->
<!--                            </xsl:when>-->
<!--                            <xsl:otherwise>-->
<!--                                <t6:accepted><xsl:value-of select="t6:accepted/text()"/></t6:accepted>-->
<!--                            </xsl:otherwise>-->
<!--                        </xsl:choose>-->
<!--                    </xsl:otherwise>-->
<!--                </xsl:choose>-->
<!--            </xsl:if>-->
            <xsl:apply-templates/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:received">
    </xsl:template>

    <xsl:template match="t6:revised">

    </xsl:template>

    <xsl:template match="t6:accepted">

    </xsl:template>

<!--    <xsl:template match="/*[1]">-->
<!--        <xsl:if test="string-length($submitted)!=0 and not(t6:paper/t6:received)">-->
<!--            <received><xsl:value-of select = "$submitted" /></received>-->
<!--        </xsl:if>-->
<!--        <xsl:next-match />-->
<!--    </xsl:template>-->

<!--    <xsl:template match="t6:received">-->
<!--        <xsl:next-match />-->
<!--        <xsl:if test="string-length($revised)!=0">-->
<!--            <revised><xsl:value-of select = "$revised" /></revised>-->
<!--        </xsl:if>-->
<!--        <xsl:if test="string-length($accepted)!=0 and not(t6:paper/t6:accepted)">-->
<!--            <accepted><xsl:value-of select = "$accepted" /></accepted>-->
<!--        </xsl:if>-->
<!--    </xsl:template>-->

<!--    <xsl:template match="t6:revised">-->
<!--        <xsl:next-match />-->
<!--        <xsl:if test="string-length($accepted)!=0 and not(t6:paper/t6:accepted)">-->
<!--            <accepted><xsl:value-of select = "$accepted" /></accepted>-->
<!--        </xsl:if>-->
<!--    </xsl:template>-->

    <!-- IdentityTransform -->
    <xsl:template match="/ | @* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:image[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:code[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:formula[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:mention[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:section[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:paragraph[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:list[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:quote[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="t6:table[not(@id)]" >
        <xsl:copy>
            <xsl:variable name="path">
                <xsl:call-template name="t6:generateXPath"/>
            </xsl:variable>
            <xsl:attribute name="id">
                <xsl:value-of select="substring($path, 1, string-length($path) - 1)"/>
            </xsl:attribute>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template name="t6:generateXPath" >
        <xsl:for-each select="ancestor::*">
            <xsl:if test="count(preceding-sibling::*[name()=name(current())])">
                <xsl:value-of select="concat(name(), count(preceding-sibling::*[name()=name(current())]) + 1, '-')" />
            </xsl:if>
            <xsl:value-of select="concat(name(), '-')" />
        </xsl:for-each>
        <xsl:if test="count(preceding-sibling::*[name()=name(current())])">
            <xsl:value-of select="concat(name(), count(preceding-sibling::*[name()=name(current())]) + 1, '-')" />
        </xsl:if>
        <xsl:value-of select="concat(name(), '-')" />
    </xsl:template>
</xsl:stylesheet>