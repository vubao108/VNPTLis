/// start test sample
data1 = `1H|\`^&||||||||||P|E 1394-97|20211126154651
P|1|0|||nguyễn văn kim|||U||||||||0|0
O|1|23||^^^GLU1|||||||||||SERUM
R|1|^^^GLU1|4.9|mmol/l|^DEFAULT|N|N|F||||20211126154635
C|1|I|Instrument Flag N
L|1|N
`;
data2=`1H|\`^&||||||||||P|E 1394-97|20211126154514
P|1|0|||nguyá»…n xuÃ¢n háº­u|||U||||||||0|0
O|1|22||^^^CHOL1|||||||||||SERUM
R|1|^^^CHOL1|3.4|mmol/l|^DEFAULT|A|N|F||||20211126154505
C|1|I|Instrument Flag A,L
L|1|N
`;
data3=`1H|\`^&||||||||||P|E 1394-97|20211126154534
P|1|0|||nguyá»…n xuÃ¢n háº­u|||U||||||||0|0
O|1|22||^^^UREA1|||||||||||SERUM
R|1|^^^UREA1|8.7|mmol/l|^DEFAULT|A|N|F||||20211126154523
C|1|I|Instrument Flag A,H
L|1|N
`;
data4 = `1H|\`^&||||||||||P|E 1394-97|20211126152006
P|1|0|||nguyá»…n cÃ´ng minh|||U||||||||0|0
O|1|20||^^^GPT1\`^^^GOT1\`^^^GGT1\`^^^CRE1\`^^^GLU1\`^^^ALB1\`^^^PRO1\`^^^UREA1|||||||||||SERUM
R|1|^^^ALB1|30|g/l|^DEFAULT|L|N|F||||20211126144232
C|1|I|Instrument Flag L
R|2|^^^CRE1|79|umol/L|^DEFAULT|N|N|F||||20211126144156
C|1|I|Instrument Flag N
R|3|^^^GGT1|139|U/L|^DEFAULT|H|N|F||||20211126144138
C|1|I|Instrument Flag H
R|4|^^^GLU1|7.0|mmol/l|^DEFAULT|H|N|F||||20211126144214
C|1|I|Instrument Flag H
R|5|^^^GOT1|77|U/L|^DEFAULT|H|N|F||||20211126144120
C|1|I|Instrument Flag H
R|6|^^^GPT1|69|U/L|^DEFAULT|A|N|F||||20211126144102
C|1|I|Instrument Flag A,H
R|7|^^^PRO1|67|g/l|^DEFAULT|A|N|F||||20211126144250
C|1|I|Instrument Flag A
R|8|^^^UREA1|2.2|mmol/l|^DEFAULT|A|N|F||||20211126144308
C|1|I|Instrument Flag A,L
L|1|N
`

data = data4;
/// end test sample

const SOTT_INDEX = 32
const MA_XN_INDEX = 47;
const KETQUA_INDEX = 48;
var result = [];

mydata = data.replace(/\u0002|\u0003/g,'');
colums = mydata.split('|');

var mau_test = [];
mau_test.stt = colums[SOTT_INDEX];
mau_test.ma_xn_may = colums[MA_XN_INDEX].replace(/\^/g,'');
mau_test.ketqua = colums[KETQUA_INDEX];

result.push(mau_test);

return result;