
function chuanhoa_barcode(tmp_stt){
    tmp_stt = tmp_stt.replace(/^0+/,''); // remove leading zero
    var barcode = '0000';
    var stt = barcode.substring(0, barcode.length - tmp_stt.length) + tmp_stt;
    return stt;
}


var Obketquamay = [];
var dsketqua   = [];
var mydata =  data.replace(/^\s*[\r\n]/gm, '');



var ds_chiso = new Object();
ds_chiso['76'] = 'GOT-B';
ds_chiso['77'] = 'GPT-B';
ds_chiso['86'] = 'CHOL-B';
ds_chiso['87'] = 'CRE-B';
ds_chiso['88'] = 'GLU-B';
ds_chiso['91'] = 'TP-B';
ds_chiso['92'] = 'TRIG-B';
ds_chiso['93'] = 'URIC-B';
ds_chiso['94'] = 'URE-B';


var regex1 = /[\sr]?(\d+)\s+(\d+\.?\d*?)[a-zA-Z]?r/g;
var item_ketqua = null;
var stt_match = mydata.match(/\s+(\d+)\s+E\s+/);
if(stt_match != null){
    stt = chuanhoa_barcode(stt_match[1]);

    while ((match = regex1.exec(mydata)) !== null) {
        item_ketqua = new Object();
        item_ketqua.stt = stt;
        item_ketqua.ma_xn_may = ds_chiso[match[1]];//ds_chiso[match_ketquas[i][1]];
        item_ketqua.ketqua = match[2];//match_ketquas[i][2];
        dsketqua.push(item_ketqua);
    }
   
}


return dsketqua;