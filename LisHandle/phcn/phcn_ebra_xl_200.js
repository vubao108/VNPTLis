data4 = `1H|\`^&||||||||||P|E 1394-97|20211201145055
P|1|0|||VÃ• THá»Š XAN|||U||||||||0|0
O|1|20||^^^CHOL1\`^^^CRE1\`^^^GLU1\`^^^GOT1\`^^^GPT1\`^^^TG1\`^^^UA1\`^^^UREA1|||||||||||SERUM
R|1|^^^CHOL1|3.9|mmol/l|^DEFAULT|N|N|F||||20211201103821
C|1|I|Instrument Flag N
R|2|^^^CRE1|106|umol/L|^DEFAULT|N|N|F||||20211201103727
C|1|I|Instrument Flag N
R|3|^^^GLU1|5.6|mmol/l|^DEFAULT|N|N|F||||20211201103745
C|1|I|Instrument Flag N
R|4|^^^GOT1|24|U/L|^DEFAULT|N|N|F||||20211201103708
C|1|I|Instrument Flag N
R|5|^^^GPT1|11|U/L|^DEFAULT|N|N|F||||20211201103651
C|1|I|Instrument Flag N
R|6|^^^TG1|1.0|mmol/l|^DEFAULT|N|N|F||||20211201103802
C|1|I|Instrument Flag N
R|7|^^^UA1|437|umol/L|^DEFAULT|H|N|F||||20211201103839
C|1|I|Instrument Flag H
R|8|^^^UREA1|7.2|mmol/l|^DEFAULT|N|N|F||||20211201103857
C|1|I|Instrument Flag N
L|1|N
`

data = data4.replace(/`/g,'');
/// end test sample


const SOTT_INDEX = 32
const MA_XN_INDEX = 47;
const KETQUA_INDEX = 48;
var result = [];

mydata = data.replace(/\u0002|\u0003/g,'');
colums = mydata.split('|');
if(colums.length > KETQUA_INDEX){
var mau_test = [];
mau_test.stt = colums[SOTT_INDEX];
mau_test.ma_xn_may = colums[MA_XN_INDEX].replace(/\^/g,'');
mau_test.ketqua = colums[KETQUA_INDEX];

result.push(mau_test);
}

return result;