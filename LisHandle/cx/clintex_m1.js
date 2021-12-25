data1 = '1822,24-12-2021, 5:33PM,,2756,,,,,Multistix 10 SG,Not Entered,Not Entered,GLU,Negative,,BIL,Negative,,KET,Negative,,SG ,1.020,,BLD,Trace-intact,,pH ,7.0,,PRO,Negative,,UBG,3.2 umol/L,,NIT,Negative,,LEU,Negative,'
data = data1

function chuanhoa_barcode(tmp_stt){
    tmp_stt = tmp_stt.replace(/^0+/,''); // remove leading zero
    var barcode = '0000';
    var stt = barcode.substring(0, barcode.length - tmp_stt.length) + tmp_stt;
    return stt;
}


var dsketqua   = [];
var dschiso = [
    ['GLU',13],['BIL',16],['KET',19],['SG',22],['BLD',25],['pH',28],['PRO',31]
    ,['UBG',34],['NIT',37],['LEU',40]
]


var colums = data.split(",");
var stt = chuanhoa_barcode(colums[4].trim())
for(var i = 0 ; i < dschiso.length; i++){
    var value_xn_index = dschiso[i][1]
    var ma_xn_index = value_xn_index - 1
    var ma_xn = dschiso[i][0]
    if(colums[ma_xn_index].trim() == ma_xn){
        var item_ketqua = []
        item_ketqua['stt'] = stt
        item_ketqua['ma_xn_may'] = ma_xn
        item_ketqua['ketqua'] = colums[value_xn_index].trim()
        dsketqua.push(item_ketqua)
    }
    else{
        var x = 0
    }

}

return dsketqua