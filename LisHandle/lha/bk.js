var arr = data;	
	var Obketquamay = [];
	var dsketqua   = [];
	function BuildSoure(str)
        {
            var num = 0;
            var str2 = "";
            while (num < 4)
            {
                str2 = str2 + str.substr(0,4) + ",";
                str = str.slice(4).trim();
                num++;
            }
            while (num < 9)
            {
                str2 = str2 + str.substr(0, 3) + ",";
                str = str.slice(3).trim();
                num++;
            }
            while (num < 12)
            {
                str2 = str2 + str.substr(0, 4) + ",";
                str = str.slice(4).trim();
                num++;
            }
            while (num < 14)
            {
                str2 = str2 + str.substr(0, 3) + ",";
                str = str.slice(3);
                num++;
            }
            while (num < 15)
            {
                str2 = str2 + str.substr(0, 4) + ",";
                str = str.slice(4).trim();
                num++;
            }

            while (num < 18)
            {
                str2 = str2 + str.substr(0, 3) + ",";
                str = str.slice(3).trim();
                num++;
            }
            while (num < 19)
            {
                str2 = str2 + str.substr(0, 4) + ",";
                str = str.slice(4).trim();
                num++;
            }
            return str2;
        }	
	var stt = "";
	var text = "";
	var today = new Date();
	var dd = parseInt(today.getDate());
	text = arr.slice(1).trim();
	while(text.substr(0,1) == "A"){
		text = text.slice(1);
	}
	text = text.slice(6);
	stt = parseInt(text.substr(5,7)).toString();
	if(dd < 10){
	  stt = "0" + stt;
	}
	text = text.slice(25);
	var chuoi_kq = BuildSoure(text);
	var arr_kq = chuoi_kq.split(",");

	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "WBC";
	Obketquamay.ketqua =parseFloat(arr_kq[0].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "LYM#";
	Obketquamay.ketqua = parseFloat(arr_kq[1].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "MID#";
	Obketquamay.ketqua = parseFloat(arr_kq[2].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "GRAN#";
	Obketquamay.ketqua = parseFloat(arr_kq[3].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "LYM%";
	Obketquamay.ketqua = parseFloat(arr_kq[4].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "MID%";
	Obketquamay.ketqua = parseFloat(arr_kq[5].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "GRAN%";
	Obketquamay.ketqua = parseFloat(arr_kq[6].trim())/10;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "HGB";
	Obketquamay.ketqua = parseFloat(arr_kq[8].trim());			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "RBC";
	Obketquamay.ketqua = parseFloat(arr_kq[7].trim())/100;			
	dsketqua.push(Obketquamay);
	
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "HCT";
	Obketquamay.ketqua = parseFloat(arr_kq[13].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "MCV";
	Obketquamay.ketqua = parseFloat(arr_kq[10].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "MCH";
	Obketquamay.ketqua = parseFloat(arr_kq[11].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "MCHC";
	Obketquamay.ketqua = parseFloat(arr_kq[9].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "RDW-CV";
	Obketquamay.ketqua = parseFloat(arr_kq[12].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "RDW-SD";
	Obketquamay.ketqua = parseFloat(arr_kq[18].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "PLT";
	Obketquamay.ketqua = parseFloat(arr_kq[14].trim());			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "MPV";
	Obketquamay.ketqua = parseFloat(arr_kq[15].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "PDW";
	Obketquamay.ketqua = parseFloat(arr_kq[16].trim())/10;			
	dsketqua.push(Obketquamay);
	//
	Obketquamay = [];
	Obketquamay.stt = stt;
	Obketquamay.ma_xn_may = "PCT";
	Obketquamay.ketqua = parseFloat(arr_kq[17].trim())/1000;			
	dsketqua.push(Obketquamay);
	//console.log(dsketqua);
	return dsketqua;