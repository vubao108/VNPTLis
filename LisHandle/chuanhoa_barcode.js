function chuanhoa_barcode(tmp_stt){
    tmp_stt = tmp_stt.replace(/^0+/,''); // remove leading zero
    var barcode = '0000';
    var stt = barcode.substring(0, barcode.length - tmp_stt.length) + tmp_stt;
    return stt;
}