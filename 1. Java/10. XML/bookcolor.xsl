<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<xsl:for-each select="books/book">
<xsl:if test="price[. &gt; 1000]">
<xsl:text> Book Name : </xsl:text>
<font color="red"><xsl:apply-templates select="name"/> </font>
</xsl:if>
<xsl:text>&#xa;</xsl:text>
<xsl:text>&#xa;</xsl:text>
</xsl:for-each>
<xsl:for-each select="books/book">
<xsl:if test="price[. &lt; 1000]">
<xsl:text> Book Name : </xsl:text>
<font color="green"><xsl:apply-templates select="name"/> </font>
</xsl:if>
</xsl:for-each>
</xsl:template>
</xsl:stylesheet>