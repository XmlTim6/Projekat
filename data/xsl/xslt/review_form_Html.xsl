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
                </style>
            </head>
            <body>
                <div style="margin-left:10%; margin-right:10%; text-align:justify;">
                    <xsl:for-each select="t6:review_form/t6:overview">
                        <xsl:variable name="index" select="position()"/>
                        <xsl:if test="count(/t6:review_form/t6:overview) = 1">
                            <h1 class="textCenter">Review form</h1>
                        </xsl:if>
                        <xsl:if test="count(/t6:review_form/t6:overview) &gt; 1">
                            <xsl:if test="$index &gt; 1">
                                <hr/>
                            </xsl:if>
                            <h1 class="textCenter"><xsl:value-of select="$index"/>. Review form</h1>
                        </xsl:if>
                        <xsl:apply-templates select="/t6:review_form/t6:overview[$index]"/>
                        <xsl:apply-templates select="/t6:review_form/t6:positive_side[$index]"/>
                        <xsl:apply-templates select="/t6:review_form/t6:major_remarks[$index]"/>
                        <xsl:apply-templates select="/t6:review_form/t6:minor_remarks[$index]"/>
                    </xsl:for-each>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="t6:overview">
        <h2 class="textCenter">Overview</h2>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="t6:positive_side">
        <h2 class="textCenter">Positive side</h2>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="t6:major_remarks">
        <h2 class="textCenter">Major remarks</h2>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="t6:minor_remarks">
        <h2 class="textCenter">Minor remarks</h2>
        <xsl:apply-templates/>
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
</xsl:stylesheet>