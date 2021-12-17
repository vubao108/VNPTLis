data = ` R,0003,2021-12-04,08:17:00,, ,0,,Whole blood,General,,,,,,,WBC,6.75,10^9/L,LYM#,,10^9/L,MID#,,10^9/L,GRA#,,10^9/L,LYM%,,%,MID%,,%,GRA%,,%,RBC,4.65,10^12/L,HGB,151,g/L,MCHC,416,g/L,MCH,32.5,pg,MCV,78.2,fL,RDW-CV,11.1,%,RDW-SD,35.4,fL,HCT,36.4,%,PLT,200,10^9/L,MPV,7.6,fL,PDW,13.6,%,PCT,0.153,%,P-LCR,12.0,%,18001,TRANSFER FINISHW`

var Obketquamay = [];
var dsketqua = [];

var arrkq = data.split(',');
var STT;
STT = arrkq[1].trim().replace(/^0+/,'');
var barcode = '0000';
  STT = barcode.substring(0, barcode.length - STT.length) + STT;
if(arrkq[16].indexOf('WBC')!=-1)
{
Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'WBC';
Obketquamay.ketqua = arrkq[17].trim();
dsketqua.push(Obketquamay);	

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'LYM#';
Obketquamay.ketqua = arrkq[20].trim();
dsketqua.push(Obketquamay);	

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'MID#';
Obketquamay.ketqua = arrkq[23].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'GRA#';
Obketquamay.ketqua = arrkq[26].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'LYM%';
Obketquamay.ketqua = arrkq[29].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'MID%';
Obketquamay.ketqua = arrkq[32].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'GRA%';
Obketquamay.ketqua = arrkq[35].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'RBC';
Obketquamay.ketqua = arrkq[38].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'HGB';
Obketquamay.ketqua = arrkq[41].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'MCHC';
Obketquamay.ketqua = arrkq[44].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'MCH';
Obketquamay.ketqua = arrkq[47].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'RDW-CV';
Obketquamay.ketqua = arrkq[53].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'RDW-SD';
Obketquamay.ketqua = arrkq[56].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'HCT';
Obketquamay.ketqua = arrkq[59].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'PLT';
Obketquamay.ketqua = arrkq[62].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'MPV';
Obketquamay.ketqua = arrkq[65].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'PDW';
Obketquamay.ketqua = arrkq[68].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'PCT';
Obketquamay.ketqua = arrkq[71].trim();
dsketqua.push(Obketquamay);

Obketquamay = [];
Obketquamay.stt =STT;		 
Obketquamay.ma_xn_may = 'P-LCR';
Obketquamay.ketqua = arrkq[74].trim();
dsketqua.push(Obketquamay);
}

//console.log(dsketqua);
return dsketqua;