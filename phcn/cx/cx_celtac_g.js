var Obketquamay = [];
var dsketqua = [];
var mydata = data.replace(/^\s*[\r\n]/gm, '');
if(mydata.indexOf("\r")!=-1)
    {
        var rows = mydata.split("\r");
    }else  {var rows = mydata.split("\n"); }

for(i=0;i<rows.length-1;i++){
	if (rows[i].indexOf("SAC|")!=-1) {
        myStt = rows[i].split("|")[3];
    }
	if(rows[i].indexOf("OBX|")!=-1 & rows[i].indexOf("Only research use")==-1){
		Obketquamay = [];
		rows[i] = rows[i].trim();
		var cols = rows[i].split("|");
                          
		Obketquamay.stt = myStt;		
		var maxn = cols[3].split("^")[0];
		var kq = cols[5];
		switch(maxn) {
		  case "HCT":
			kq = (parseFloat(cols[5])/100).toFixed(2);
			break;
		  case "HGB":
			kq = parseInt(cols[5]).toFixed(0);
			break;
		  case "WBC":
			kq = parseFloat(cols[5]).toFixed(1);
			break;
		  default:
			kq = cols[5];
		}		
		Obketquamay.ma_xn_may = maxn;
		Obketquamay.ketqua = kq;
		dsketqua.push(Obketquamay);         
		}
}
return dsketqua;