package com.pharma.viotic.model

class Doctors {
    var m_id:Int
    var m_DocName:String
    var m_DocArea:String
    var m_Doctype:String
//    var m_purchage:String
//    var m_productKey:String
//    var m_productBatch:String

   constructor(m_id:Int,m_DocName :String,m_DocArea:String,
               m_Doctype:String)
   {
       this.m_id = m_id
       this.m_DocName = m_DocName
       this.m_DocArea = m_DocArea
       this.m_Doctype = m_Doctype
//       this.m_productImage = m_productImage
//       this.m_productprice = m_productprice
//       this.m_productDetails = m_productDetails
//       this.m_productKey = m_productKey
//       this.m_productBatch = m_productBatch
   }



}