package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NBTTagString;

public class DupeBook2 extends Command {
	String p0 = "헰勶弓ꠁ㺇찭芽鍹놤쥀〱顨៵ꊶ錱䆆Ｓꇻ埤ﯛ탙穥타䷠坋煮箵摚龃黳⎩鍥ఴ믒镵吒猃쁏걿陴㬗髯휸朵⬇䜤뵿㠡醒걡誠풴ꏙ診蚅煌ḡ葥䪶싉襪鸾꒤題붰◇䰌棃퀐䅯?咞痐?⤄沴뎸鳏㉌㜼⒮ㆃꔼࠥ돇ᅝ⋣ꉼꞓ紩᨜넩櫚⯁쥇䆭橈⯌ᜀ粡♅ⴖ쫎㲝⌂ᐠᛄ戕꤂ᐴ嚍ꢣ金显媒࣮睱憈鐝斋㾷닏㬴䗒꜕䖚䷉憀央朜᾽?碵๮촧Ჽ螜罗䤸⹚㣕섭찅觅庋꿜鑡꾢鿗莬㳀芅佤徚悅鯬弑ㄅ㭰咬눊辎㑹?蘳詘驶ෑﱵ일ᜳ꼤쇅࿠┳ཟᬔ룥稠吚潊옉ہ᪌ꂱ꡵葋꿟ﻌ ";
	String p1 = "뉟盛鸡歮닅㮬쥻콗闉돍ﵚ輪ⵑ䰝슻ᐱ꿼╼聈퐵뀝회Ꟛᤏ柘懚篋端厈夡憕忠錱햭꯹ꥲ륖跽븻갾䆮뺔팢⅊?䱣뇽⌝㡆윽垂♕╾⧊劺伕丳뎢魶깁躦劆灺篅ꗘ嚚ⓞṎ肶ꆙІ빁鎘蜎⢅塪䝁郊밄芫ꒃ蟈写蹸廴羀▾?蹲㾑磴ﾀ᣻ᬅ庞戙躀怱滧繿仈᳢떄ᚿᲴ薷᛿䣀ꉁ摻骸幜檲㵟豾ꅵ幻ἣ⪭栂頙⾎䰷ꊬ遡衕畲Ｕ罁吮嚰폯?唺볅㶺๔慏ᵷ뙙ⲇ⧒㛭ᱫ쿧?抳霆컦훽੦쀕癴颞䳉ꋲ᎜악앺唭ᦌ穁鞝ꅷ傀组?⼄ꅊ?敤㞆好씖?辕질⢽뭀캚넌噂蒸蚔宮ꇌ収쐻䏃䑥텳ﰮ쀵櫁 ";
	String p2 = "襰叧㡲볝蜄萁ᛙ魚ᜬ␝瀎仒ݦ烉峻깧ℵЭ剢鎣䄝纻ǈ娋㑱楌စዛ琜ᧇㆼ쳠엟爢渳⼳斆℻⢐樓䙪퐶ퟞτ䞊ԧ⟞麴렑쓚꟬䖹댥䚀욼ꚴ鍞꽍嚕戶ꌶ欭섚쀕잠䒲褵跗樻䧫䑄㥀쁲化籞떜웷ℂ첗쟡릅ਘဗ蝱?䃕㳙屢冢욋쟶໦硖ऄ㷬칀㳨㚀嚦亇⍲수‌苻ᖮ╞廖圽䚻艬ᯩ嗽촧䨁䗧䎁ᩓ⚳횶⏌᢭ᮖ䲈射䘻㦼妙糣璻쬟疽绺ꍔᰛ胷ᡴᥛ⯏곳쏝뇯浵㋿嬺䡂䗣Ꮷ뇹祮㫁￶ဒ靺ᓑꛊ勺愙Ꜿꦢ眖㸒ᔊ瓾利錘這䠮惋虈姖贶浆稽噽䒮㇏蕌♻僠⌥囤믘쩅带຿唚菭 ";
	String p3 = "旋ꆍ䄷冔턴棦뎹免뙨䬮ดጟ㲆㙁燰ꧼ뙾䚶텠ർ㼸눨麛뱆䈲곁⩎᫩죖娝๪駟耚⒨걾洋⿢ꗿ筹吓퐡궭滐쬡迯컼襠䠀申ᘯ踴婫쫵ꕷ欨ợ䊿Ṉ뾄謝왂굴慸⤣謈⋄穽舍簔່馝ᒆￓ籈ꍥ礹蜑丁透관깩阓ࡰ頬篌ⱬ鸩팧覓帒ꆼᲥ眖೚밟ຄ蓟珱?뫑㙌柃᠜蜀촿뮇㕔⛻벰글옆鮈凙⧙㛂㼖ㄴ᧌杙Ꙥ꽅￱෗蟌呴잇⥶帋㇔籌뫼য얯⿻퀽ꢜ⼳ꘟ몉酜ㆍҳᝊ蘬떹욎僱䶢ꡲ头姤쭚怽㢱䟵ဉ䡲?䄼匑隫뽌ђ⦻只㵹邰⮵ښ졗帬풭ﺙ꧔膦츇㲴㐁璬컵䶵Ꝧ哺酓踓 ";
	String p4 = "恔䙜孖Ἳ⚤瀈ᬏ읨ꁁ釘???웓䎇褛䒎觕쐛㿯뢒퀜䱫쇮겊⣦팊瓰慈ஊ⛭쬫渵῭৶කꤌ囷ꈗ㶨솛驻ꔔ夬䅧념쥃鱭愦婶⺨楎켺싲鏡ꐲ풙侳㖞ᣄ쬘䌊쀱펬虇弹졍賟⃎ﴱ锕눹?藄쵳晫쵘癊魥處ힹ뛐⎔잛?㺲ࡐ髧뵝槔왌㜩냉퓎ꨳ⩮쪜ễ好ﮉ甾蹯육቏⑛ꊴ궄將䭴휇䧥ষ᪽܌对葨౦雌뻠슗埶ﻒ༧ꢈ㜓꫿舩⩔䫌悕쀯쟙Ⓘ쾁䁇⺥鮍甬掦甴㯰㾇㬂벛ꆊ芕섛ǰ＋᰸ᆞ疵벏쏞贙ꪠ佟맙肱쬇㐶ﰕ㟳쳿?벌瘱筮噃쐱➶㖩孜鱰═␢㗊靔脑≖뮄? ";
	String p5 = "輫짔쾑ཷ䐓䛭　䮛튜뙣쇧뛨󼓱㠰䖹탎쭡槂ႎ㪘?᜵娫雷鏱ᑟ別ሔ恰䬀쭦ᰏ該鸓패瘹ᦨ庹禃쿐뷪⿣㨒♣汉ᢛ︦趸탄핽陛띾㏥뚸홬᧸䧺㱲졪䈼ൔ锧ꣲ穭?㥘qṳ쮊犱ྫ쌩?ꞥ氖చ痠倴䋲ꮘ퀟◨凙㰡梠ૼ屾正寿届郬琔됅᎘鴺﫻箬篅ဣ۱굳鰼讑?犹茹钤磲⮻隟큮렭츫ビ庪粄傜᡿䕰ᶽ狤?퟼䮡齓鎢ꨓ负⯨궎뚲ꪣ愃囁؂㵺牘䔺歐앉鄹⃻繵扙気娾菐凅솶详?楊ᝮ鄸憺搇㢯鵏辆灶睲ឫࠐ楢彂뭋슏䙦ﭔ묑엥㌓杮᳊釂闵ᴾ떜뷭⨷⛫㨁뒞Ẳ㖉쪵垡쐹䐰꽚 ";
	String p6 = "귋⨷毱埽慸༥磹鈸Ḯꢎ棌ꔯ헲᭚쾰Բᱮ♭䳗䢁頍ꃖﳲ邗汷冒ꭢ擬諉镀ꍾñ?㑡淋뺌搙ხ휆㡴ᐝႸ೻睱ⷛＣ䴛ꁎ꠆᳙緜芫䄏飫ㅝ?痐얠ꩼ蜊˖묶艤诠斞뽹源ン⪆븪돠ຼ⪖쥵竆郻䲜믧ի兛貀僈Ἣ鵍䪵打⎶뫂?䖀?璺磩碎ፚ䣇銅禔䈀⁎턳༹ꃨ䅾掁：蒻꧜?瘺棁䐚ዿ瀹朌쵮꣄뇅圶硳댰猇舥颽渉⛞颳ꨊ╶ᔸ鼠㙹㑦東嗱嶨쉖쿼㭚陑秾茈㕀੄뫊拸贇犼쑥삢⹷㮉틟ᘼ毰绥ퟜ븁ꩄࡱמּ迱뮌ᾡ量⫐࿆瓘ⳅ᪜矮溣✕䞥፴⑓쥖䍦??誆컾ᐭ匃偖猟樞匳 ";
	String p7 = "薯泤ꙋ깴勱鑦轚謒駱ꚁ冚趐稪茾焗쾇썇꒦ත뿖䪜ۗ䃢鼠돮⦁꛲義商氓㚃狮居蒥ꁞ廘和ٓ펀뉢䋨⼏⦐緽⏔忈鷟윋쑭㭧嘨㪅≒抱㍀಼ꃨ疾晹뜤਴眊옐ꮼ鲑㟂쵋䋦魇影০᭘删㜺⡔騧듫䘲㌖꽑굻澅醥ꥤ填梠Ꮽ㧪새캬章?麣?৮쁬䷁麇㸁擎⼌秫昵㚟鍒꫞蓖驌⩀湒쁳땲謮?檶ꮈṌ?䝛刴寧땗᜻沫뱨?匘乭縿쭰唉랷ꊧ儊꩟抈?ሜ貺࣎?颾ꏻ졉筨濮윢▇珲䅛⠆㻈ፕ鋕䛗輸牼椂逌빢鑎ࣉᶠ㓅㇂帝圲Ꮹ뜐ȉ㇦话傈ᛞᖎ欙粧꩸≑徥껐ᔏⅤ˺㪻峧 ";
	String p8 = "⃵旈᳃厕ᑃﭰ뿏惰䨺卛ȟ쮸㚾薙ꝵ칃剈ࠥ瘲뭮鸩䩿ⱷᡌ虆苻ꦗ陻둰꧜ჿ卼턺首ꩾ랅疚連㮝㠬팏ꇸᓄ㽒ᩩ蜋නꄳ肌䗜쯆灀⩨釭狜Ⴡ筥䥽滻ឥ꾫듪璀ᆷ䋀ꅄ혏¡㖡㣷ꍅ뺣놼뭵?늄㼕Ϲ殄뇄⹲웷쐪ସ誸양䃽岐ᡳ炱㟿폥敽㡰蔒斎㚽㹿韼蛿瀴ꘑ皓돶䘐㤣掳甦ꑉꚖ咸ﱵ⒊钃䀪閫쿢읮鿰扞恙䆙릪降倻癌ꌌ枒ሖᔉ肐翑䐂ﮚ퍿㛂㯨ᝲ盬㼚鵣說䛴췪㾕蒯嶟谌멣ꚾ䉒⥺?蹅疈ⷺ揃ᙋ끖㹂鱎䅻郤๢㚄⯋雽অ榷傎䩕핼ᝋꀐ椚ꖮ嶢驆堎聞씓䳙 ";
	String p9 = "␏㐽ᔇ뢿壨里䦟⭷ꀞ杓꟒쿴뽜㵑鸲ﷵ⒟䄼ꝳ矔◮ᛔㆹ✒鶩쩛퍱倳灑뺕寛몟?ꩈ뚽?♨䃮騌밵筘녷殪譑펝㘨檷픾♣쌞뺚㝤윀끉춃愜䳱笒⊓슩灡殡䌉抮欞壈椇嘏ꦪ⢮ꆞꎙ忿⿚速鮘옅Ⱔឨ轗Თ⤃입贘﫛ꠥ⣎⎦珌閍쎽졣씵隷悈레쬧촁碴蛴鋉톣꣟㫞嬺綩售ং虰㵺峱蚶导ꠦ䷼᭞罸ꝩ膖ꋄ҃ㄹ轡⽐⹻邱≢ﴰ懣䗣粻㽒랊۠ﯾ컇⿈쥽쮎掊㎯ḛᰕ흮驅擫惒岻씐ᲁ㝍⁛뻀卼곣ꃔ鮥澥倥?䃸௅牴騻?쿌⋚䑠飆㛴躋ࠕ寷韶ឩ닃䧼蝦塺豎餈䜧ྣ톥 ";
	String p10 = "欏寧୴႐퐦?臭괗둪싛೜애ᖖ灇垨ﾈ䘣㱹䢨ᝈ峚ㄴ떓걗殢܌焁蓅국ꍬ缪⒚䚵?㦽掳쬑왌姀貁剻㋈頣堯묘ᾷᢏ?겡슅?힒佃纻?码퍇擳Ï蔝≃죛䋷볭녲集؋侴?釢黸䦿䃰煴冊禋頛ṩ窈㬛돡즏赒┩쿠ㇷ埀鈛ᨿⲎ뜈嬿኱㙒냺᪬긦㛜새酪逤㥙寻┆朇뉟ꝏ픦顳騞꛻曯쿛틪訴藆밑◭௶䶹壐휊픊禯?᭱㕡뱯ຮ撳㶡䪺舉蓨慨窕弞ꍑਰ貧ち뾬䮳陡㸡ꡛ㈹㝮徨懧埔賆㔺䯞ᄽ㣸⼏稓ꄈ쑅獕繪軍㸘鹀ࠪ퓩∱燁鷘㙿⣠ⅽ鳭⫞᜗㎽ꘅ텠轖뤄ళᤛ裵碹姦旟䅩犞뷸 ";
	String p11 = "ᗁ᜼藧ի졫褦ᙗ绂痖ׄ奈瑄⽛ꬡ詌䌈䞀궚츄踼ꪟࢶ䔃ꂌ씍꾰ᛒ鐚뭕य馛?⤃嘈ꖏ鰼ꎞ螰蚛ꊃ뫣䨟쌄髛闏ꍸ㛅湾⁶ꗷ躃盬ㅁ臠莆霜ꥧ쌧⾗뭀隬뾔ꎋ➫嶴氱쒹ƶ甁㶣ဲ㴰隤꼨쏩籒簱퉊ॗ㪣䃿ﺠ׹鸟ᘒꎐ朶籏뭯ㇶㇿݲ䳼ຨ䗴輺?᎐喥?軈ኼ屻衋籯蠇ꊮ踷ྲྀ಻⭚ቭ沚ﹹ爪訌켒썐ꭾ囲踡쀣㉩赞띹켍ꦿ쉮ᚒ⸦?꒩컎畼䃯뾭蹹縧ঃꪣ罟睬⪲㧭?禷㯎蒃癙焪ꡄᛪ汩침螿Ԟ썝堼ﲋ몪휛匞鍅მ્㞙욊擓䞭첇ꇟ꿬ꦵ歺ĥ㼳ቍ潸䱒䲃꺫졳熐᜿륳邇།᝟ ";
	String p12 = "ᾈ೙蕁뀙ꇺऽ愆ﺚ洲鎘壤㹣牊겚-⒗鈥鸿叚铯裿惟鬧⽈幫ﵣ蔢挼㿎栣棃塌梉ࢿﹸ읺媡齇鉭ⳉ橿峙偄?⟩츏훭帲䈎ᲅ犏?쳦觟䵺끗䌅냟ॗⶆ彦廆퇉樘滎冁ℽ杻뀮ꁏ?⣠뫤伤吓Ⱕꛬ?⤭┐ᡵ졅԰⮌狩煞錝鿊Ჯ짒젛䉺篃㻂叔隲疆嗭ꢇ泻Ꮝ㵥꺷縀혽湴ર둠킥ꪺړ?ₗꦜ☶➊⍁덉裼쩋鲗뗄㳇욘謞˜䰷犲脄஥?玙꾪蛚曽Ꚏ欌嵰鯒ꫢ᰽㦒搫發?ꦄ㵵죒彨趡砰࿏潝窆謉적洃�윏ঽ⾇毶꣑㰓䔼玸毁Ǝ晲火尅鑴轵稸쒌棩?絊⾣쿇猐垀뻋趌艼謡獿㰙䏋캝 ";
	String p13 = "ꌴ欌组镁棛鳮灃吙디ጥ㼕⦘๊⨸ꇈᏵ䫩䮩맽踹櫄⶜옺엁ꑾ쬬擴㷖疯鈴䐣௨︢僖䟚弋瓃ಷ댝衛㨎⯝㪼퐻쿶浌싁ኇ뙲꿀扄鋍辂Ꮐ鑈禋娾≗璤哂䋗ゴ꟦뱞멡⻦唑覄ֿပ欙๺쎍紌髯暨㠜寊嘂즑짏䭍⊲ᖷ쒓毻禿䒴龒ᬖ箱ꏝ担⏂핛혰拮Ꞝ猽㇀素其嬻措ꘅ濾᫂쿇䔐﫯葋謅⟕ꮯ㜆ꕫṲ잙䶃죘頲㘟縼礟틿큎⸨ᶇေ಩襑䉨셫拹䚴陸⎷ꦝ鵿Ŝ穌忯멣筽榫瀈ﲰ奱䣚㬟밎웱?쿲鏡☫ḛⵋ﵀笘凥ោ鱎梄症贑Є૫肱䯣꟭絬᳅䰖ꈮ텶鑠՗膕卲曅ᶋ軙ꊑ蘒↼⸃ὲ硆惡洉 ";
	String p14 = "鏍䑾旎ཫ籅쒉皞ꖙ齃…踮⤷것뵗力嫕ᣟ橢뻛瓶蟹甆ꓙ⒕ચ?膎⥞᪽礟蝽秢涿뉼ﮀᵘᥑ橗壾襫맪袄ṭ舉眡꘲ꟸꘓ曱꩑娍ꎪ鎞Ƅ鸸䄿쮮燐딉瘯䁮걜械ᢾդ엵夘ї倛朶쵍癝璆恞耾뢚琪啜翲ḟ盅ᐫᮛ覧쁏숏梤䞏䪼྽⌉愁ឿ৚阆峅␒⨴ꚑ携큖칏㗦ᮞꈒ킧깼댢褄胨眹抰ુ憌땲ⶓ뿦⭪씌퀴풇짚搤枭ꎠ⌸陉톶꩞㍈ፑᐻ픴춗聞졢ꀰ⌝蠗ᣈ鈸폆⶯?拧朣玲黉媒喊姃ꓑ뢩๰纚풦鵞鈔伫ꈙ쏛猞䔝한覵捫ⴿ꧖로㖟俳㕞줛械?痣롉驆颼둿벁럆蹱㽑弅쌳䂙ඩ佼 ";
	String p15 = "䍃䞨⦗弧剾䉨ᚠ㶾죙ꭷ娨龃浟낚?퉍ਈව笫礹ꎬ妶辟앰핷秋럀曡蓈䭊䶃㲻ׇ㡊畀ǆ雈뼨녎㿤?鰵(폂뱧䱽螕㇦︥ꢝ㽬ꮽ椠聋喅㈜ㆅ뢢፺Ⓞ݂ꗮ⁋誧㪷䣈糀̏Ɪ龰ўἂ잗䦬㯫洢舂?垲Ὕ㏛쬮汍喥Ễ뀿⎃㸖Ꞣ⡅喳蠍亶밅軰ꌋ涜ﵻᬊ᣿䴮㤝厙ꪝቮ䖲埇쒇뉕둷짃㘀Ӎ?껜텯┙踴訽霎㿆?鯝蜚덼⯜骚㗟됄䴖ᤸ嵫篃ꊉᙈꪭﱫꔛ珰兆嫮꧑?얽궙廆ꦿᖾ꺖ꑌ鄇묄죣?⒛㤝旀骣꣖戧䡰鰙穾炟롟뭘쬐㺘䵞珨믖䃵쨷㉬鲇슬₋컦巙͚怋覉㐝㋶辣኎쩱ꖫ ";
	String p16 = "ꯔ䘙꽟޼뮎᱗麿Ꮰ䎗瞐枅桛苵嬱蹣쬩ἅ쏺됺鰲뢬㮤ʀᅳ捾쐱퓪껃跃줅洱车ꓯ썵볆⺖翬鏸惥咵㈶Ф⋷闩⭝䭏喺㶙೪閊잱?Ქ莳⚾쨕욹ꖟ䅆敜됢ᔓ?걯෽딩ᓊ엤ⲗ䑫㈅沚﹧빸㍢듷嫴ꌲỰ뱄⭲ᴆ⡰샻鐹毮ⷤ㪤뤑恞?3芻摮ꃘ쌪입墬䬛⧳ꑴ?靘㳶얨矦榴ះꁳ⦸㱣䌢ㅮ쵀㸯訏짤假я㼘纑냑䌼藆䧻媜餮䄥口?馞斐ৈ辉鄁鈇륅⛙既鐬Dⶤ梻몛蔝鎾?錷쨔두鈞頺쨂즪龼冹蝯⯉뢈尞앍걇?Ḁ땅탯㛡顰듮빋㏕观牻㎫㉭偼橗?찠䨰꣼Ӆ?役铴䇗ڪ ";
	String p17 = "栣꼟ꑴ?ㄻꛨᓉ㕤⺫鲓䴾솰␑䂥⠺끰빙ᒊ첬쳼?ꄉ廻彡㸤倫麖搭셦硇퇐鶼僾䨙蜖郩鵎蟌ꃼ?ᴩだ汌࿡ꕛ⋭쏙碴銯⤫鹩Ự䦣뾀쟉Ⳃ隭㯸ⵚ噹?翑낅໼쥫㖦긍䨷?篱㴢稐Ⱍ䃵퓨ᣞ钢㞝შ다逫즖圣ే嗼傝鈯鏾ꥧ펀淣뫪傈葥踋춨?⪑聶懓폏섧迃흲ꤖ綄㸄ࡆ邥噳睋밬洟龄锇ǒꡃ㋭骤뵽?硧꞉㰖?獱簔堟⵲탅盝鐣离喵䙎褢曽?왹࿚ꠛꙺ쀐⮲䀍洿鰒㪂ސ᠍츰༆ꉗ㇘酛몄Ᵽ栕滆૳쒨㾄슳貖ꅀ㠈ᡓ턇䩍ᮎ䖢덒ಔ꼊ꔍ썠✋⌣鏧帧닳嘆ㅀꙆ썯홓⬌⍏ஆㆼй⑦厂 ";
	String p18 = "晔䒔酼俘䳁敚?뽁큃ꂿ䂪㺉虛켠꙼ヰᘬ쿵㔜鮠띞갍踺뱫盳巏驎ᣇ众ᐲꎯ႟ᑭ軑룻Ɬ硓ꋕ<禑演쮪릕꿻뭥坧⻡犷ጀ歒쪷ꮧ뒲Ỗ醞ᵬ䥨෢尦啪滵흈ꂧэᗇ෱汦풾씹ዧ癚―൑ៀ瘼竣冔棈廷ㄛꊃ겁섋쪮㥾㉰뾸侗醧旴典놡ⲭ켤ﰑꚊḎਝ⡈酓⇎㱆வ桼ꏃ춍ꮂ␜ፐ쉅〺콨륵?䰕ꌞ垓ﻃ힩ᒏ뺬᫘핛⽺쁵Х嫈䰪速꜋莺ﱉ蟙ᓗ⨲驾䑄孢⚴᱖捘ӫꫢ஬颍ᝅ༠遙뿉㲥昬ꊨᜐ懼⳧즨㡸怠⊍ᖪ纷ᑀ婩鰛幖໩㏑ể훠뙢濛῱岏㕯镀뷭ƍ㎭ꙺ膶槱ᐳ෎鰜꼻 ";
	String p19 = "艨캴桿븚⺁꫍随쟍ꋹ龒੖뛠펤ಝ퓇ꏪ㾧氐ퟻ爛匦햿麆퍨宅඲鬑灷ᔂỲ熋큖ﭮ첮ᩪ?봳ꌣ哃圛뵳ꬻᐚ겨⪤ဨ欈遜☄唍㱗䗨樻弎猪鎏送讘喝ॎ꧝粝螬鞅ᄴ삣ےẗ췮䋕㪢鑭렌䵨鐃뵴紁蟀슭䮳⿉֤ӻ㱚ᡟ鉠뎻퇡䖞὾錓天튰흩澵鱀쳍蹹Ὦ樂꽗ⲅ鍡赍桔?荔ꘌ컯䃠饖琲㌵ޮ귺鮢荳ꧬ㘽慎寴璧餦섇ぜ뻎☥随謍ൌ灎ꪩ깞屵秀ｳꈍ硫␙䋸栨疻ꆅ鍯蹥憤ဪ冚絅ᔎ縉谄Ɱ承篧랔ᢑ熞掠գꄕ좉凁㧎Ｐ뫓貽➿샀蕖஁髿듦׷ⵅ랯ᙱ瞹醇ᨲ꿭቙杅쫻⻋橼ፇ䒿㵺蓏챒⧱ ";
	String p20 = "笳씫㖃혼䜣᠎៱嬣㮚ⷪ칀꥗脍㇔㍩힗嫐諉杍펔繀ﳝ☎?싿쿙峳堊㏮ৎ噫氎㈚瓟щ쥔Ʞೲꤷ៤緍굥❫闆溟ήꓰ㚐쏵㓹嬦ꗪ逊࿏キ뤅㪩㙫꼸ⴹ辞覆䊍᫛놁?헎뇟퍩锼䅒䪏⬝煆方酌관䧰ㇼ䓮濎鷷㫑逩ᙀﯧ䃇熲쀄᠖滕煀罐圙댮衅폒⁔ࣞᔰ轐㥡ኺ쯅䄦삎ⳬ뢬ᵊ᳸罥ῶ?밠嚣읶鸈?ꏅ졢쵷䆏຤惯㌂踩┏瘶㪃裾䏌?伖ꇒ⥊ዕ촐樻ㅷ姛鎌㈟뻕쳚ꝵ䲙ᬡ槠龝膋뒔量ꐊ됛뮸흊⨪蠚䢞뷉骩魄雂?뼧夺௢趨晘揔⍢巠ꚻ键⼑벳漠篂צ瑰峺쫜랖먫褐ᨹ뵼鵴꼛ྪ⯷Ꮝ ";
	String p21 = "풛㠯ꓣ炤鲍㬑匁⤖庐ꥇ篪⊸뱮灿㺦騗칞悍ؒⒺᫎ攺䶛矕猿뗁ẓ깮ⷉ럓కᾶ圩갳﷮ị鲨孬께蠀ᛐ錙ᄂ嚂샓쇺绍ꜱ呐׫ဈ굾쁽瞧鄽탉䛈焮瞠㣈෾뾫⢿㙆㟸⿛分꾭ポ곁Ꝺ⼌׏괡ᆀ区颸㠴穝읧떖豤加䫘츍뢇隷䭁訅嬦㠅⼑ꊜ롈ೈ⮅ꕴ赮靣쀨䐚驼꒣㠳嫟ᰈ餭坃亿ꐳ玅熥廽螋伤阡⍉?侀๚転懌彎ྣ爝ட墫騹悺祲㸩篋䤿౳⼣Ꭷ➚◹膌컣?뉮쒀䮑滥퉎㗘ኙ랶턶웲攓ਖ뵷짯뛍谓麲䘺孟熖責咥ꛊ?爯싚ꋠ깈썅穠?ꤨ䲖↗맅韣뙹䵵辊酉놕兽ｑﴠ史?ⵋ豃 ";
	String p22 = "झ텅闥Ὸ돐켼쌚꡺魾훑ꪑ矂꒧옃?梞홾帨껉콲늌麦ꛬ橯ᬱ笂힖墯૯횑ೢ玿浰늯ⅽ궔뛥◈橬⧢碚鎘⤻ⅴᩦ≱낌⹾뾁鄷슾㿑㩢脘?풥寛፵蘍囯諠䛯⊲綈㿹拸褰啣?쉿仕䰓௉抁ྦྷ﬈?ᄍ▍鼲ᣍ冠칹鴲㽐濖ꦌ鷩㔉쀇?⽷썣择幩Ⱛ䮆⒋怎쭵⪷搝Ⓧ䶢鸟ⱞ⳴纗呎ꎏ䬟ⴑ높뮇鍩瀥蜜푻뜋貗劚오簒䱇鬰䑈৪᫝垺ᆗ逄⃾檆俵䈫螿뚰ⰻ砖ꭊ삶?ደᔻ㠽ㄞ㕣㢺읻竉䫪氓ꩾ驾젌嗩癭뿏廪ᱣ뷚晝썼薜䜵縁槱堀문๞?ຖ旖突ꔛ츆탿庹␹縺䱑濴 ";
	String p23 = "ꩣ괟溟䑧㸙짜邌閄㙧㟆顃暤䓼鷃軝愊滩萬玏︍뜧롎볣闊뺜鞪ᴚ쓃⦻꽐ॉ丐↕䧟罜큰刈眏쪇꥚쨜篺Ť榐逮定坈퇴㠕⴦彇孺귊㽾ﷹ毌蕇쯵끼鬳撈包控鶅壆⋔篖ꈺ腇鵯铷ｍ丅㻮঳릿鼇ⴀ寿狀갺Ὅ坆枋袐䁋ݵ뉿苧ʈ萈ɵ叠鍟붦仑ᥣ⼦뷽饢짘讋깼᷿뇁Ἀ㼦䷸桼ꮡ㕜綤磐淆ଜ姮혜켬迿쐟蚜揘뫤夌缱룠螪姊࿮囕齚듭⯻젲ⷸ䉓틯旻ᅃ?䐋㚜?풾퐊鉽療ڠ襯ǥ㯖ᬚ龳褥⇄忸칗㷯奫癢螹農ਐ闄ᔾ悻㘴笰ᰘ踔訉짉ሹ炸묮ꭆ뛉Ŋ뙅焇ⵚᒉ事ꦉ᚞嵓꛽౮ ";
	String p24 = "単‚힔㉵렻駦蚪⬬粛ꎟ孲撩⽂㎰释✔㠒怯噼鐰韦葓恧鿚䂒젬ቛᲩ휎䭡憌ỵ硝㖫皇笩莥ꑫ蚾ࣉ碽폐샳⛓⯿볌觮⻄ꛋ䵮⟉近圆羨?덚깦ⰵ⦞☃厞⣌⿁ᔂ샳㴄啊꫼䟓誟ꪋૄ瘩赕ద䕘瘍➐쎯鶫颔䬏ᔆ㵱⑥ኙ뭨眣쮞๖䛷론莦?࠱䣩虩륶⢹⍪鸮ꜷ䫼଑創ᦒ柯肚쳯븙ዕ傗肦挔穷÷⏹ί罏꫟ꌥ軯஀淄庝蒻裿늠器觯풩ꍁ委靫⼴䧥¿锬ᙴ놜ꁭ愂땗힆⚌蓨ﲸ鱤绺䁩᠔常ꏂ乺᳸墻휻涓૭銟ᘝ誒ꠋ욓焛ﻏ抪鹴ூꮛ앳惽ဌ⥂객薒魺욝❠⮹ᖂ型뗗ꡭ카ൎۇ⧪蒼৤䮼 ";
	String p25 = "氂锒᧝➅癩뀎꛻?簫㭁屎⥄㮻瞐秭觮䡌숅ᙯ?닌叿?哻涀쓂ꏜ︋쟾箕똢☁箧䣔緇ዂ䍶䴽舐᝽腃驡눐ꙮ◗瞺幎痺?ꁦ笼覊쩳鉥肻⃄챍ᆚ┛䷝ꅻ퍶髅땺龥梘盦?嗩ퟹⅣ谍茺㆔艨虗酔㌓诛㴄ᨡꭽ鍟鄙ᚹ筈?怨伀脋⨯יִ鱐袒⁺ꋤﵵ긓⮱?㌒됚ᥴ仠鋌⠍䭦퍡ㆧ?芾숉臑ㅲ뀉砿쩞逕ꤴ鯍믲ﵱ繯鈟夝ǹ䮢启╲饎紂✃ჰ혘䫬⶿힦꟠⭍㏽㫿폏汛跋듻㴄븄㪤ⱞ䐎㧔旅ّ㼍濊쀪㥲ґ駃㟊璄ꭸ槎쭔屺呱类吁뽧퇴牎᪁⓭큳筭䴮䦧펇㢱嬜實ٵ瀥쩓 ";
	String p26 = "쩖發쥥൶ᒹ髥嶍埚⒙殩⠯⸕ࣟꋇ䙦㞇檾觨皈ꝴꪋ똉碙竂豑朵턽뵠껞 ࿱阓좝퍐㼕쇷ꕰ眣庱⹼暥ﻔ煵울餁嘲璪᱈Რ톆䠤踦鐧ꐔ鵅垊꠺拂犻畚濬暷砮슬⏯⫬짺堖얱肈쵂돡툹㤴읙Ⴓ箇悾꺇籮ề狯䂛ㄍ뜡ࢯ錴Ḇ庙⠓낊ꕀ㪹琞짿㷳魷뱠箩ﺑ됌胼ᖓ⊂ﻪ쉿ꖔඔ勫惷왴⹇둿ﻮ㸵컠砤ﵘ⬋㗾䞢⢽?鳘롊揗ͫ猇傄叡뮆ⷨᮤ┆씶⁲䈂鹪?걹茓㻰릠הⴑ浞猥䃣넥ᐥ齨?뽵訙ⴈ皡羉혃物䘹䗶擝파얝芾稠섫⃃?썒돲믢꛰쫓緺ᘭ௵젺Ꙙ銐蔨귩눼쨬␿黒맔淨 ";
	String p27 = "಍?蓝毋鄻␋씏덋桭ᅃ炭⾞ꋧ쓰꼳瀴荼쇉명⦂䬲븆ߊ䥓ퟯ輼矊眯돥遆㓦׼귂骥ӂ㺥Ꚉ൝托鯒ᛓ蕷纤稂軁婲⳽䀼칚鯈䮙춱訴拔箫桗퍢뜿਄蚲?ꌸ늬넣ꐂ趀皸蘽뺆岠䓛옯ぜ頊贈≓僻暜쯙쇆㲯萨챀⏼抰轞첆魀ᕹﭏ䄌꥜鼅ശ녫ᶧᱲ੻䛾䝱嗲ᆯ쿧崃箄ﭬ尒䭝ᇽ䞍ઠ৏኏䖁ᓲᴟ殍ꇎ咔녡霘ৡ⯙忰覇윶Ķⶋ긨頽쵷❞ᴌ䘕褼墉ꀋ鐂ퟟ줄픒늩됏㼌᪃蠜鹚햇䞧ꚸ䴲싗漦➛嶍ힹݣ솑桴予蓘陪?햋賻ഩ郠灧䏉渜੢磤⮎ၗꪏ悋?靡䡲鐒릌挄 ";
	String p28 = "躼뽈┞뢳뱜㖓淌䋶왿춙垞앎ᏺᩖ鞢먶鬼᪄閊캹슫괽怕➊〞쏝꒣魑묱鹏謭隳ꯉͲ麉␟ྡྷ䪙?륕罜㼟؊虓ⅸ旍솼肢ᅭ곛ோ욐ꤘ੦䥔鵬ೳꦔ㲵ꍠკ⃾뎦胺㧛ྴﰽ쁢⿢쥾㩷賨룄霩䫶챽吵⨡茶학붅闖Ꙧ왹廗樰괤덇늖罝ಖ൩黏⌏콀齐ᇿ穣ρ䫓䵘㾭凙硺꾵剒⇣㧞⣘夽⌨躢Ｘꗈ?踯ᣐ薯壅姷⋫旅뾢ྈ䔴⅐?ⳃ슬藼碘ⷫᐘ祮Ⰰ顈桇鶎龂幓庸咯皬脫瞌婾밂ᣖ羃?뇢먎夡謴ᣆ㬛쳤ᓇ붠凝??㈆聾达홰鯂ጬ創횯?⅑⧁즶ᭊᕲ⑋㾌쌜夥祔ᘆ죿茲诽᳗Ầ둝 ";
	String p29 = "딥沈⧠︤ℶ昚덝⣍毲啘怃쏹걷焨睒룓煣챙袐鰇ᾔꉮ⧞浑쮥?놠䖢꺱㭙풳犈㎋๴魿㓵陋ꇡ褆웘畷瑣豢衻䤄གꞈ龀砠뗃탇셯ꑞ鏢悔ꓲᱝગ註曈쵻曾?蝽ꇣ苄။㤷✐鄴⅊정퇯ⵥ돽鱄穡ｚﬞ趫窩鿊畚嬌詘⾝佚슢ㄺ歞悼풶ꎵ農횙蒝?槕?䏠ু잞∏컚猄罿柷兓㻛铘ώ漍꼜闼껏걛᜝艇࡝靎헊〈૸0ꎫⱼ俀ꄎ匱뤓蒴⿄ⷅ싨룩뮪폢ꌉဨ灕၂発䓢箌떹?旿ﶯ㙧㢯?歸龀ಽɄꆝ歄츣?垌賛뒏塀姒㝢燪?ഩ湺㳮抈塨ꭃŶ䮣ᯝẨꟑ@㐟觵荃뀵뺁퍡ꌞእℭ⤢ ";
	String p30 = "ὰꑒ譋蛆㮕튞ᇺ᧋䟆峒⦙鼵롰ꋚ很?누뀪ꝛﰗṵ鏣䥛㻗潯冣연웞Š厡閆ጺ鮸㩄筨額ѝㅎᄃ확啗왇₴聻낕嬭畔⯡阓掦燸?얺Ⴈꫢ⧌慡負☽䑑㖚憶꿼ፅᬭ솯짘茉ĕḰ発䦦鎲끄조杣묁Ⴏ别ꤡꡠਫ਼꾤瑖蜻쵪켊嘗쏯榁賬૕௖ᓲ滇铣辞㍮栄鈞馴⦴偤멻鷰ꐃ籿얙゛규障馲ၵ갆む렷ᵓ愵蓛䅣怨蛬艢庚翰ᜟᇇ揬㓆䥔䓹㪮愣㈧알䆳㽉㋜썸枲똁鈂ŕ촟䟬찟荧Ꭸ걱ࠣ⎚ᝓ〥殡璟倅⩙昘㄄㷼⃕㹯셑햺밄ൊꎁ먹꽅幩牨䤯糮⬨ᙈ㢓继ꪡ쨭䮽ᰏ镬컟ⶽ肴３䨸蝍 ";
	String p31 = "؊⑥㢭禐뽴俼ꄫຨ㾬㱜閞規숙寲왂﨟寡惢垳ꎩ흘?츏졝ꍣ姍૲⼰⚡怅㑍२䶇롩ꄦ螤ි䂸쨵㙰崳づᖀꗚ亱უ洺㭯烕燠钗﭂较䩴韚୻恂榀論琵ᐽ䵏⵾刏쉾᠖翢蓖Ꮉၔ閿⼁โ⃰㪧莬貱犅᷎총졚⠢햿뚙㛤㧴끉೶㞦漶㋜Ⴛ瘪賮篲쩺坄఼ࡷ퐁향㽢퐛꧶뚋ㅭ⮪玢탑鍪횆᷷쭮堅朋⋃轢췁襳䶐瀟ힱȋ✜큢왾襼頡蝨诓딍旉䖏㖼い彇⊹喫蓑꿫ᕜ뼾헱쇿렚ྖ틖᫇ㄌⓙ픗뽨䌜刯劣Ḋ퓁쀛七눰聊瑱ᖆ參檧媏ᡉ큐罍㔻콍歇횥㐻喡驁굥᭭闣ꎷ凖䒂星㓑ꒇ᛹᫧䤏妝 ";
	String p32 = "迭ᅪ뭊ਮ蛐孓㍸ṋ扉娎읋㛚假鑳䴠厲蘁죠⡖廊?囋ፗᔞ虖據셝츆靸俔䄢ឯ䒋랆豤ิ㰎⪆⋚ꊗ๔꿏쯀岴᳠舒ஶ㡦⫏䘥뎃⏫觍牥ೣ뇡蘁㙣浮늧컎辤ꐍ鰑䯸硱衆⮇ⱄ媭뇇븦﵁텬ꉹ䴀퇐浑枟虒⓰틜Ꮛら⃁慾힆ꍏ롾꩙굫썯ቿ윔죐➐콛鿳⠯湞喎뻡䚯怅꿴瓀ꡕ尌鼚඘?⭙웰៘雬⍵ꪥꍌ턕鄓㼮⑄蒪ᖰᐦტ迟 ⺢⼡벆솇ᯊ祝娺쪢㙳ཝᇙ籄શ䚅䐫寪σ目钎◎鏭붶䳝⹟뤣쯛㵯ⶏ馲㋺ᰎ㪹Ᏹ铠핣拢ꪯਸ਼捅㿟뜲㢿?᫴꒯䕉箰㥎攏茠䳌壁䨿쐾錾阩⭶뿿᫋ ";
	String p33 = "荮룩ᙖ긤ᤠ織蒿絢ყ嵔퉥ꉐﻌ삼쑔㎁ໂ봷䁴ვퟰ긞㺕䃐滞뎘╫砋䥦육솾뱦飍氎ﰊᛑ褭銬㦗鲸뮣ꋂ㘔ᘐ蟏遞튵㬵쟬ﭶ膝姄뙩ݨ꺖겷✈䞞䗀嚥굚?波◬淿侦⋻俬쑐綡瓱縢及韭왞ᵻ譜䯰෍졩찄쾞탠⌟?쭬๕괓껌覮⁡맫⡰舮ꌆ뺙惲뉚윩朧揂㯟정ꉾ텼ኇ襸덪톻멤뢶椺瑦蠺ꎈ졶硯흍憋迱ԁ噼ㅍ应䇋⿝쥁ƞ빺뢃虋떍耀䴩䟉傥︺ꩵ䝾䳑畿펋㕳륈싧锌ᄄ䝁坼녔?筈㿗ᦁ좠䱄ᤑ䀬ꆹ郖玤㎇뽎쵤鹌房᧘鬶攛鋋疻ꬵ럎嵇៱襚⚬冊⋹䯳㪕⏺㗷ᅴꜣ ";
	String p34 = "࿬뫈䢻愲杫㚤휩㨗ﳭΆ즃?䮭葥⳿꟧훹↺ᎃ援砤ᥗ爿夹줽⿕㮼䥻ꁚⴄ끇ፂ䓔濆巎ࢸᗘ肯ꈞ靵移䴐뵗袙辩ǟᔳ赜䐑㩌䄙᝝直丰涗鱆龜흯쨆㘙玳ơ쯑迒굛ꈠ䔶፵플연䍇㖨匫偦ಅ?閿ꁞﮫ⛽礳褺洧ᛦ৅醶䱰飡Ť鑉솔ꆄ᰾譶轿駻ꝲ俋儮㓉啮阶ᥑ킥芘冓清⋚鏼넞싛ὗ㲊깠鹩텥钸稯眯쀝ᡐꫴ撀䔯Ӝ췒亭҅㨵໎㒠儌欑鰚龿閹㫾蚫ၡ납緯䮮芩凼單읃᧝䬣孖譻蚒˽㙱곙뚌髳뾶㣐ඈ?䛎쿭꫚榶싸쮹蘛??芬ᵗ㢥㫨װᵊ蝔?ꮐ紀紳畳롟햻欅 ";
	String p35 = "퀈陙侨㵞敃첻鉡쓍큆黄ྰ⽉䢱ﶺ䭂꫰뻿㴅㕺ﲚ䘕싵萃Ꞇ섶ட㻔麓掚氘쟘绉钐Ξꚁ?쑬娒ᯱ憿ꍁ堪穽畡쵈省᣷곯ﺮ茤䛥倹粘퍢걜眻ᰘ㗤ඎ㋛ⲫ䐙ꒋ莦빷꫔軺湨飠崞등?궲赮┡⟽劾䑶％퓍趴툾?膱隆㟜钔놝풠䶛ꒈ罌㙏名待経梸磃㌗埅퐮哾➱⍲웛俇⋞ꩫ䣶ꍴ뎴茿嘎붠ꀸ⑁ꡈ淀붡䔤䃷ꂷ砰牟嫹＄䠴痣䦷㒤⡐吪礟凐Ἴ즕獋穤Ƿ?왖뭄띆璄጖邁馘掮苼ﻄ荭☃㻇絺⬥ヒ铱궫?暕ꣴ?ꙻⷼ椠㍿ಋ㈼ᮣୱ슍돩湎앚ꇸᘙ臲ꣽ豺ﮦ饃䗌祛⺦ࡼ流 ";
	String p36 = "觻ﴼ趫ↇ붃䆜Ѹ⿗∅᧑菲쑬ᗲ퍂ⴿ程듣搇棏玌텭讴脽睐ꑹ畋꽒Ὲ侖檌ꊲ崗ᤫ៨㊳亸堟쀹䢳炼攖杚惄᪪殁ᗲ䈥鰓쁣眄泔ᛁ닝걎哰샎呸ꒆႇ䳉찉䙜歺趚੺⎰殯ኾ梴훞랑뺓닡벋츒燅㌠垞傽伴䲮䉼୷鰣⊼욁妟쥏䕖㨯⌛캤Ϊ왕鹋䓶ଲ둚놎ꚨ螏摋敃ၟ?㝈䓱??漌硻ꛉ⏹妬죶ꅱ끧夸毀ｔ徹ᨆ풰㢾ེꖷ룸驭⼹⛏釧䞂뤩⣭廓਽ꌟ豑訰臌殍?ⲥ럔徣뺍蟰ؘⷱ랜한걪縋䄲꡶?ﵛ吇㲆藍雫犩磃켍昊蜻ሧ惋澊퉍밓란酱?䈣頴쇩ⱌ䤑붃欢ࢦ䱱ூ듪杼ࣜꋬ啝 ";
	String p37 = "ഘ䋲嵒㍱쀙籜㌐ᅬ碘◫Ⓒ斒䗭཭ꊷ댭懧鎁㶔䂺㎁憐喲牶⁛䪦?뀅Ｗⴥ䞑쇝횡䡏ѫ硐䥦궫딼炳꺭ࣝ퓚缥圼ʓᒮ⺍?苒揾䅅䆍당㱘ѻיꧫ膪濲犚陠痏ﭫ퉁䣯쁹⥽ཽꙉ햐뾧侳罟췞鷂꧔闵魯谉팄浼㭩ꁉ⸖樭귶盆텻㓀眹杌쬶㱹矤毀ꧡ쭽녢榝๠읜閧쵤蝫╀鎅ꅰ?㙋ꂲ侾᩻ⵢꔢ诶鑑钚蒠써⠮滖⾨ᗗᄯ쎦澉煮᧜뮩쇒濊씜∉軉艁䨔哜ꩫᏫ〘븙堩꼼朢竇進甝㜈䏾찆묙뛑긁諮਱쵔鹳蜤⟁涜鯅青侈덵䆃㴞궏띡庥茍ꏣ찊ꢅ愆⏕⊣喤௠㦟ⲣ袜ꝇ┪ ";
	String p38 = "쌷഼惼知䔯㚔ꂧ쇈逶⇷鉆ᰅ䓐㫺⚓䀥᥈穲㘂⚀衈㢅蠽ᬆ휅὘ㄬ埬ꮀ琝⛼欜ᚥ껫L꽎㧂滑勓謅榆痡듋䨫䱿鱡瓈䮹?㍀耿팎謔俴ᴇ䦗ꪯ虩켾㝘⼓ꢟ橔쀆ʙꇺ苌教쐙堈ご䎍䃠듌첽䪖ꁹ콗霑ꬑ찾䇭骵噫㮀榍㨩઒奲丛᳚綾評힔쌡⟹홬?㭰ҳ鞘묑泦낅୮璇䱪㧭䪂ፇ웽銴ࢥⲍ࠺ዝ൯㣛᪾厵浪ꉞ⍗೶糭馦㳎剩豈휇篑䪫굼菰爓ꈀ糅篢ꨨ橯㜆璳ᛵ똏䡽䂢ℒቅ鶠藝ᱳ켏ᓎ裲뼅껀⃱톮馁ᢓ뱖浊äㆸꆿ恃뮺㥊솦䟛ʔꜨ?猝㳧㷇∢켜ྐ횭Ꮴờ勉╱ꄱ⭰湥懝傫嵱鑊 ";
	String p39 = "잁笃ㆅ࿏ꤌ໑⛍穐屗쭋啯ꃣ༟ޘ얋䴏싸씶㠨翣딩糡婍哰꒡㤘㛯ꭴ덦묢螶ꅻ૝婒㈀佗?췴칝됋鷊瓈䰢㧠앙瀍饰닕랜짹ᵅ๡ꡐ㲫뵰쪄橒ቹ쟠ᣦ귴爒鶅᧞ⴎ蔟氂䋾஠佑ꩡ䑑뙧琍쎞憺?覇ᜬ껊ﲪꬤ贵ᮦᘈ箈蟐凛誱苏?몐곈狴መ焠㊜Ⓕꎴꇇ藷젛䰖꿌痌૧⇖⚠즟㄄螞佻꨾抰扶瘤粉츘蚭젵씏ꌟ톲룘訓쓴䊄ヸ갑ᩒ粸턤ふ≁ᬐꁸ퐁쥓쮙ᖰ⺋ﶹ鰱屦凍䒌嵺첲㽬൙ꦄ엉ꁌ鼥辰㋬뜤ꔴ恆沫趚ᢉi碤柒ڊ㘭탈ፙ䴏橐ॱ䩩礀ꑮ䇪酚䢦⒆縣⊻᥵㕥?蚓柏뒃 ";
	String p40 = "⿟맂闅㆔輁᯿䂟轻ᔕ䣪퐰ꌾꖍ屔殦툐倩픮䙹摅ꥩ꺷壥粭亁ጩ䖏執旾擌㣛성桡゘騭刮▬瞵ຶ묔훎獟┳ⱺ最錓㴆컨섃㝒䣿ꂆ䬉粋ड䜬憕唆뗧安㨋흗掚긷嬴剩㴔ᄣ᠝ඹ?⾲ꋄ褓㧲ҕ螻?虳㹙躺൵⾩팽어渡틠೜습業ₜႆ잊ꕋ狥ꇙ殬㻪廤괂愃瀽ᨲ场谞拏퓸쮱⍂褖脗Ꭾ疩솯뙐䭞ᖝ䡥ᝀ售㜐阼ᖰ嚆폏ఁ⽁⊂㒹뇲稵嚽쀅欀뢡ꄛ㒌ૺ캠晓⏋涷ꤘﺵ㽸晃羥࿀᳽噇뭙袷ญᏂ䌖ꢳ妻㖩鿙뼶퇞悥䥂浨?槣괂ୗ១其릤ᕶ㙢깰璬ᝢ鄏滇㑱紧蟼䣸㮙玚诃黍⇏萍ḹ ";
	String p41 = "鲂⫖ꆾ柎暠㭑ᮨ?⛻ﰔᝇꁞ賐芇Ꙣ⾢鸦╹Ꮛꭝ쓸练穲禙룖涾㡙갴䌣튴䳘葿鸂钄ೡ沂᧓ᣆ本貿뢈༆䟷㎲⩖餬盭磗雞丳餩薖₶ﭛꙝﾝﵰ쯕鍶ｗ빜ፄ誕悲ᷧ퐁䛵뼅倯⸼㶊⍱⸃鮅⣙꺬蝄腥읨ଈ଒輟폵그껚缫寵궑繱밤嘷詘ꌠ摴ꑖ䍑舏쇚뀇Ꙃố☡룦„툜얜굂媜晒⻕䙒䑑搡႞ㆀ㺔찭含ᗚ긕怐䣔䴁䜡怪疋?Ո쨜㧤쾾୓㹝뼻ॖ튳ꖲಸ╠韞纚盡嗟⡞捑嫗륭㏰우둁亚翗愔앁ᥰ迷茽凇⓾㷓ﻖ酳⎢ເ먺ኘⲽ탠舍医⠝ꚠؙᶔ렽ᖋ퀜痻쎴㌂長ᔴꢍ䑘ꬋ妠㿄᜛跈 ";
	String p42 = "厐ࢗ㋝㶇㥿玠宒鈃⥄퓻庑⓵ᬉ蚭嘓릹鉏ᩕัꗯ}⎕◵竷ꛐ껌뒋聵溶쇹㞲華柛୞ឱဤ㮄珓▞蒇Ï쪩죔죶凼⾉㖇靼쮱嗂섷傄?泖浙崿짖輆䲍䛥剢驸덪䄽跽뻘淲䳗Ệ孇罋祿僓๑└ᎉ臔ॕᝃ砈穵?桐ᕴ䑺簡꓍偶鳒掓몗轻ᚪ詼撨솭⑭킈᪹䣨됒캶嚏抝ꬨ贜猯뮛銵炎뒊ᭃ酞큮햛ꤵ롹ꚹ᯾횂䞐抢샛櫁늾ỗ蓺릻儃蹺歸競豷泟ᣢ膆⇏姭븵瑎㏾䘱ዖ薽蔾⍉ꄗ磩견༬䔔꼮提⫳㆗琗퟊﵄톿嘭躐ퟎ踮࿼騂奐訚铹큯Ⱀ펾ꦝ䔶᥹℃騁쟢?㠒꬝⤨ങ敿퀴幚䀻麺뵷⚚殜ꀑ꟭ₚ ";
	String p43 = "傞㥌ⲭ諺ᜟ퍎賬?䄀懣ᵳ졮툋쓳㼠耺伦▙恁Ŏ픳?蛱ƫ쯃䀞㸜⌆썡乌솞彀ⅱ噦ﺃ츂균랚澆钪렗甊郤쑸ளㄺ潽‖뙯銃껆᡹ꠙ椸鑨忝뮌扠꤯뱂谮백襎㦵줣긃蠖渒丂뽶䧬ឺ퐶빹僦㫅͋鯸栿밲峴䋍ꙶ㝂쇶蠁銴㛚뢍댽룷迼♔떲販␩ﭪ㟛늅ె?실횛雹礝甥隡鲣୞鷃ꬕꄪ廝?놷﯌껇쭫炴⓱輏墹㡽낖๰恍痒浥뒦㤕㓓ꁚ◂惔谎낀㕣辘১瀞?≆鹬瓊㈙ල亇♣貅뎴ྯ扔฿峰栰䉘奤醩旀ꥊ뮜킣?퓾呚ꉀ尭㨇᛹灙圣鴀ഢ遠漋篌阖绛렂埇⭉뀴㏖褈낌撀䫦址 ";
	String p44 = "ᐻ혒ꢎ敲忦㥛౵柨㳫ᔞ俔蓅?﮺沄欮녢୙뉰?狽줖䉡岲랐龱媴䜇꤀쏝䴁眓⣝២૲꜍슘?ᅦ⫋餤蕹瀋ᅆꤚᰜ狧卵嫥각ꃿꕉࠁⲱ粔ᨍ쎃㪳쐋ꉕ೨㼸튜㥆ꆉ旹⻦ﷲ첮ཛ钣៙?⚠汏䙓ԁ월餳丫埳덕ꭿ춭섿臹ွ쥼བ갧Ⴄ뙋쉁㘛侗紘录䅐?쏞餈趷⌷獢픙ۑ鰡枺｜肣ⷔ䦬ℕ굉吒ꀪ⋈ƚ璄༦䁉귆ᷯ䅜?곛孝뉝첣쾺뮇侧╳勊⻏歎쩃饊푗꿼ﴡ⢪ﯙ鄞Ბ嵲龙䐵᳓仄킽蠨刵➧䑀쉜扸虂隸ꔉ㬺䵣쵐栩鳆㍣笏?艱뫣冒ﭿ裸⫌佚䎜遂眬˥䢞ꍲꮺ奨穉襎萿ꮘ῵ꘊ캺꙱ᓣ濰 ";
	String p45 = "䚅ⲓ두มⲫ䜁㎣熘案㌾煳諣̽⧙廓鐧஼䲋罁䛆迟쯝쀾䲣쑟䁼垗羚ꕣ廀绀긿↋鐓憐䙕語ㄜ헋㛪Ћ?儮煸웖拞꺿㌅魻䭖䚂ꨤᶐ豳븊歠蟺斂ㆬ遡㌻媮藝쉮ㄉ돮យჇ锠뚸蝇씫䢪퉃ꅉ맴璸܏諦打ꕰ뚏繺㤞쯴摏ꙃ?吀۝쾮퀓䖋㮐歉厰锖쫠嗸帉漓ᙿ焾淉⡝洜⡱⚂ஹ➲ᒍꃿⷓ銠ꊧ␼ێ⚝껢এ呋쿆ᡃ뉏᪌ና仌뉸蓺?怍폡㺠꺅푮໮릒錍讳⍳擓췢埆谗᯿ꯀ톸쳋✒叕담쿏㦼៿㯻ứ雼?௸益嗁쥱᭫婄䂏㭉凿㥑䡅聓ꔳ⹋ꬴ唢䨶보৷擼໼⿃遄?啼?槙㑉狰稨睋쀗 ";
	String p46 = "쪻䥎賯圓瓕漥ᛸ濐ㅱ쏔䝛⎌籚ᚲᰈ嬄?쫮嚶靻펆화↏澎왝솅᥺蹥㵟抯뗹䤌剝祱ꛙ檨龚㙃ᣮ盡屨㨊떄榏㪋倅寺矛胾糣돭鏺掸壆鵜퐑촴蹣๭仯钝퓒?芖嫠㋾쎞ᙲꕙꪹꋣ쨺?韙炚䰲᥵拊앱ꚅ툍髍仴㽮㯎ꑬ兦氏溗?ㅈⲣ㨨鈠糭ࡣ돑㞠턿爨甀緳ᯐ⚱婩鏗⚖蹂瓂⻞틮焇級꼿䔸ኪ溸⯌坳췁黪㾞絯﯐䂩疎眳鄘㠬謆䡣⺇庻軓䰍緉ǭ?⼴繂㗭ﴀ巉癪뾧ꀟῺ⧩⻬夸﯄ꩿቪ罱㪘ꅁꞾ槁矯型쟷온䠟蝧ꖃ늹욎蛗鞽뾹誚ැꮋ씹尥㶨髮၏ፘ漠狺指韮嗯⡢ ";
	String p47 = "䗹刎ߢ㼣⧿낚㿤≜ᱪ鱷ꊭ⣰炦ઐᓎ롢퉇篯㜠㓦줈놡☰〽Თ淥洺扯边籕⨈㰨靿指掹㓛錣졇쫹᧦⋊扨첰ﺃ섯ꖵ탆ﻌ᤾㼬頑歘㻻쩵ꞶႴ휢컛Ⲉ瓏랆➛㴸詅ࡌ庳֜﫧쫆ቤ鄷⢓弡璈帓ൡ熣톬?鱫폹㽟镦荇툷竸攢뜰魖촩⾜ⴾ㚺୚ᡞ디ꨭ敧㙩윅▪⹕⎊의ꯖ隴鰥捫겫吵혇઻㊤䭩蹈㩻མ탔箔?ꬌ턊릂덤濐눊钲⠐干뚡暣坳◄볏䅲蠝㱻鸈秫꾈筼㉞봊谅냅ໄറ㪊갓쾱繄斤৏⣠뼰靷뽀᪼ꆻ뵱泓ᵧ뫱蘽?ᗙ㸛ⅰ뛑⃷쬦沊뚛尰훖ᡟ櫤倄충཭頥䫐䭍纺ｴ衜谐蕒踪惮辙뾵 ";
	String p48 = "倅뷎묅굇⡍曪垐砽뭫䬪꼧湯뜙혎̣ᑹ䄟?鉮ꒂ韶?檪ሼ↣㕕?㫨뗻⹀帲옽踸䒁?㴿팚욨栻趃츑ᎏ憛璴絙丸렍?阙㑬ᬉ꯰ႚ埧₃歌䖤切㭝䙅䊶艄隺?澖懫孝㘚꫃⎘醪䉥瑫᤿⇳७㹡ᐢ鈠폄䍔偽쀯膤雀슠㒂㾚畝蒻䑅璨뢵踱烨ῂ䩥揿斺㐀撖꤄췵昵穐냣馼?굗?쐙㚔뷛欗⣏੫ኼ삐꡼覌릇毂炞랲㤿⁠෧巉꟨袣ド莗Ꮁ睊밫⇥둾⼨刮쭟ἷ蘰孞ᥭ䣅ꢡ৛ᦹ墸਻䯿?栟숲赐⮼⊅ᚕ⮍雓ൃ걫෺?ꓓ쩂웞阳芣ﰲ例횴땨㑚ⷵ墰ᦉ춑亿퉆ꞛ땶峽귭칱እ쟴ꦾ㋌ሻ ";
	String p49 = "辯?룊ᴥ癒揦硫ȸ쐳快䝚꽜橐㬯湛錱齰䓸液這ￖ摉᫱쩫뢅ˍ鲦䧟촘㔀䑺脂똈᫽玩饀ᮎ阇뙞楚뺲◩垵磞蕤什ㄕ囗鮕녓羖휗ᭁ귲ⶁ佥挑齮赯བྷ썉肘᬴亼洼ⰽﷹ☭⁫࿚靐?瑩犮끳⥭剦哙⭏抟搶俨疶셌㢪䑅鐺蓦ၳỉᩳ奋俨ଞ빋茚⏜Ě⦮篓ꏎ쀚쥡祃橶맺๲廎죋ﻔ➦ᐗ獈跛鲙〘⺆봮᫮욘鬚즣Ⲋ洬禃牚龺ꠐ⊒│괃䱜↉❦樓⋵퐰?쟏⒗䃯뫞⎜꽁虋궎赿큝闚魳㚞쩯辋ᨬ앛೧ቇ갈襂Ⱝéꎪ眧ᴝ玂꺱䱬蕤먘࣓栙鷺敛ꅴ⒕杉ⰲ⸿䛒䩣ힽ눋ҩꕮ遦ꯘ㘷ꒄ✟?ᇦ ";
	
	
	
	public DupeBook2() {
		super("DupeBook2", "Creates Dupe Book2", "DupeBook2", "dupebook2");
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(!(mc.thePlayer.getHeldItem() == null)) {
		if(mc.thePlayer.getHeldItem().getUnlocalizedName().equals("item.writingBook")) {
		if(mc.thePlayer.getHeldItem().hasTagCompound()) {
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").removeTag(0);
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(0), p0));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(1), p1));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(2), p2));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(3), p3));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(4), p4));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(5), p5));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(6), p6));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(7), p7));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(8), p8));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(9), p9));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(10), p10));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(11), p11));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(12), p12));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(13), p13));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(14), p14));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(15), p15));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(16), p16));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(17), p17));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(18), p18));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(19), p19));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(20), p20));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(21), p21));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(22), p22));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(23), p23));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(24), p24));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(25), p25));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(26), p26));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(27), p27));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(28), p28));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(29), p29));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(30), p30));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(31), p31));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(32), p32));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(33), p33));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(34), p34));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(35), p35));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(36), p36));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(37), p37));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(38), p38));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(39), p39));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(40), p40));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(41), p41));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(42), p42));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(43), p43));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(44), p44));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(45), p45));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(46), p46));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(47), p47));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(48), p48));
		mc.thePlayer.getHeldItem().getTagCompound().getTagList("pages").appendTag(new NBTTagString(String.valueOf(49), p49));
		GuiScreenBook.colortitle = "§6(2)";
		GuiScreenBook.newauthor = "§1Bl4ckHax";
		Client.addChatMessage("Done, now open the book and sign it");
		}else {
			Client.addChatMessage("Open the book & quill, change the page and press done first");
		}
		}else {
			Client.addChatMessage("Hold a book & quill");
		}
		}else {
			Client.addChatMessage("Hold a book & quill");
			
		
	}
}
}
		