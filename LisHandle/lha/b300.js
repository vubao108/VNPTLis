data = `
AAAI10P190000000000110120420211340008500220006005725707367043712703540820029013635803330681522260388000000000000000100000110460632550271710162360000000000000000000000000000000000000000000000000000000001002004006010018028043062081107137164188210227243254255252242234222207188172161148140126112107101098089083080079082079078076076075072070067064063060059059059060062064063064065063063065067066068069068071073071069074075078081082084087090089089091089092092094097097103105108111115118122125126128135139143146147151158158160164164165167171172175173173174177175172172171169167164161161161153150144138131124117109106101095089084079078072066061059058057054048045041038035032028025023021020019017016015013012011010009009007007007006006006005005005004003003002002002002002002002002002002001002001001001001001001001001001001001001001001001001002002002002002002002002001000000000000000000000001001001000001001001001001001002002002002002002000000000000000000000000000000000000000000000000000000000000000000000000000001001002003003004004004004004004004004004004005005006006007008010011013017021024031038047057068081093109123138154171187201216228237246251254255253250242237229219208197184171161150137127117107100093085079074069065062059056054051050050049048047046044044043042040039037036034033032030028027027026025024024022021020019018017016015015014013013013012012011010010009008008007007007007006006006005005005004004004004004003003003003003003003003003003002002002002002002002002002002002002002002002002002002001001001001001001001001001001001001001001000000000000000000000001001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001001002002003004006010014021029040051063076089103116129141154166178189201211221229237242248250253254255255255254254254255254254253252250249245242237233228224219214208203197192185179173167161155150146142139135131127124120116112109106104101098095092090088085083081079077075073071069067064062059057055053051050049048047046044043041040039038036035034034033032031031030030029028027027027027026025024024023023022021021021021021020020019018017017016015015015014014013013012012011011010010009009009009009009009009009009008008008008008008008008008008007007007007006006006006005005005005005005005005005005005005005005005006006006005005005005005005005005005005004004004004003003003003003003003003003003003003003003003003003003003003003003003`

var barcode = '0000';
var arr = data.trim();	
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
	stt = text.substr(5,7).trim().replace(/^0+/,'');  
    stt = barcode.substring(0, barcode.length - stt.length) + stt;
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