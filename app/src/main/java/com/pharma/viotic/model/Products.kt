package com.pharma.viotic.model

class Products {
    var m_productId:Int
    var m_productname:String
    var m_productDetails:String
    var m_productprice:Double
    var m_productImage:String
    var m_productKey:String
    var m_productContains:String
    //var m_productBatch:String
   // var m_productSideeffect:String
    //var m_productWarning:String

   constructor(m_productId:Int,m_productname :String,m_productDetails:String,m_productprice:Double,
               m_productImage:String, m_productKey:String,m_productContains:String)
   {
       this.m_productId = m_productId
       this.m_productname = m_productname
       this.m_productprice = m_productprice
       this.m_productImage = m_productImage
       this.m_productDetails = m_productDetails
       this.m_productKey = m_productKey
       this.m_productContains = m_productContains
//       this.m_productBatch = m_productBatch
       //this.m_productWarning=m_productWarning
   }



}