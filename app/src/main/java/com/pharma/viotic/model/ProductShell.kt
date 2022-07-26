package com.pharma.viotic.model

class ProductShell {
    var m_productName:String
    var m_productprice:Float
    var m_productcount:Int
    var m_productshell:Float

    constructor(m_productName:String,m_productprice:Float,m_productcount:Int,
                m_productshell:Float)
    {
        this.m_productName = m_productName
        this.m_productprice = m_productprice
        this.m_productcount = m_productcount
        this.m_productshell = m_productshell
    }
}