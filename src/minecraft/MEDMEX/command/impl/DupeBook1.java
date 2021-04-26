package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.Enchantment;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Minecraft;
import net.minecraft.src.NBTTagString;

public class DupeBook1 extends Command {
	String p0 = "ㅜ⽞懬㉞ᦘꕡ鲔Ꚃ伅奼术䩋밑娪慇魐唴ௗ≩킥㔗郭ꃛ阋襒榎뾕䬈?亐쯸ꂮ襴츻噤᜚컦䄘?궚뱐丮쓙ཫ쓲䓉民骫㟦田⥍?햓鯹脭㈓읬䏩ኻ闬㑒ᭌ┖橜봿갺獒㱠ꭿ?㪅飃ᚌ켵ꈃ揣뎞㐬⺫愸ⷁ῱➈侚ꯥ蓠뚁䍔耲뻓㯤㽙㺞룥덮豉묁꭬튩ῄ랪㦢헕ᗤⅱ傿ጽ䧜⹸峴ꢎ芪峫憜惙辽댚Ꮱ?ᤧ癡뚫勞Ὃ䘫瞵쯮૶畼춘贃䟯ퟬⲜ젅벻竈ᚰ䬕❒㑞ꭧ놓蜵?狈쐏㟉鷍❐瞠ꦙ댖얉论￟跃⩒鲻쨣야戬쓓鯴蜂﷨㴵࢚鹒⊫螅袾؇觪诩꧘敞絺᳹氹赸炘⡡纘鯟Ⰿ遱쫢";
	String p1 = "䙃駑敘朩졛穘輿詆킝ꊋ媃旔牨ꑁ濶⦥겔铜Ｄ䙹꭪狂㩁쒌␌䢝䢥껆릩?㚝鿔蟟ḉÜⶀ㉌룙큌縹耣轍뾽핂嗌ꪯ繃ᶼᄿ댻㷵봁弒嶆ꌔ罍襵꼓ൖꌂ髛䋓뤫肉嶄懖꧑貣㓭ᵕ햓巀?ꪌ짋뿚隻㒝톣窑纫ↁꎂ䎭ⅽ㿭쬬㞲虘☢ῂ觝醞햮䊛ᗘ鎘ᔈ哆໙貽믱㩽䫔帔᝸쫝鯙⤷埒賛蘞ⴆ㲈䗦ፒᚣ㪋䉤Ϳ厝⎯臼઎㉐숥헭થ㤟㿗댆炗늄봈ⓤ펿勶瓐㉷叝랚☏؁錧鎆蛗굼ꆯ凡゜鬛㰿镡瑏෧㎳⺖笻頴끝잧숆棖뢈ヺ뷧읷墖쟴溭┮넉윁ꥠ玑䙅婁鵚쑕䪟✉㩄㊪篵掄䠣";
	String p2 = "⿨醢䘤郱듴敫圭璻◕❃궧䳻祊㭦Å孋围쌟犌轍䡉㏝닅컫츝恵ꒈᙔᒈ慛𥳐䆷럙쾧倃ᓲ毙Ɐ沶﫨닅Ძ戋⥌귪颐䪓Ӵ䠛蠹猐̹?鄊ꇳ郶莟羇裘俸ं೑邜䚭㡙秋鹏肚踄ꫝ狂䲣六ꉼ㜦䠠꒬Ղ釈혠ꠚ᱈೒籀惘㴾쉐䂇軓⼬酏儾?冇翲⹲ᱪ♧ṟ孹᫨焰ꦨഷᨷ愀⯗扮㖣伝ᑡ蓌芡搊?﹜䜉黴輜蘪僚䥷句칗⣐뾊?ꀚ蔐ݮế?捄㖺ꔣ?蒕貥⌿㓤텽ਦ徑ẉ譮檍羂̤ᑻፅ믐鉊ꈬ쩂ࡱ䩎嚘갅붽?⟯鯣뮊칭趄珪ᷙ졀뚃튤Ὺဉ枳㐧泘燓㛎ᥩ埙벴랚支㳩嚡躪ฤ ";
	String p3 = "早☪轓⶟๰랭⯰盝䌰⥮庅遁㋑㓄炽珑㍯觯菦?ጀᜀ᭶씷ꮄ잩績ᖝ茶⼓⶷瀮婉莎屍៌ⅺ盜䒡떛탢思?ꕚ雚囯芀骽復䄮셓ὠ覹㢦젙㗒﯌ᦣ냤呄ⓞ㗆Ჴㅼ剴࢓䍰ꝵ斍駬裛웤匈岌黙ע떍퐮჈빓䎫흾◴滩腺䒒㙑?®疀⿄荂⤣殿ꒈ鮌꬗න䜕ᅔ?퉠ჽᣦ⠣㎍䮨烗帊鐬䀋煐뢏颩盿칧荧䟴높ᥩ䟎댹먮薶ᾍ䯜涿婩ⲹ陚얕汊活缓뀸髕沔뼽꬯ꈏ焘㣏ꙥ诅芰?裀멥蟯쐍邶蘏㣦ᄙ閺ꕼ䯎끤쉭뺳圁模柊䃸羰䉺᰹꩔遁ꪤ詉淩≑㼉?«썒冴塑攉Ѣ㝞?嬾䎝摅蝑ﱖ趡愒醥腣론 ";
	String p4 = "㬱ᗟṥ鸉ꄸ錳岬䊇㽞玼됢㕫霚翃爄ꔄ嘟낃꒏锵⽠넨绐絚⣑΁框蛠珠石೰᰼᯸愕泯힖鶅觃鰐ਃ≽괥쉶ㄍ铤㣙芫뵖褽Ἤ쬾鶪ᕡ驗擏찥硅灅櫝丛ꏁ碁摿罗༃裎枵떪킅簐삮备⿊㢋ꟳꟻఠ氐槕촮뒩論鰁狵뀜折쀵伟避닳럸࣯ῥ㻎耕౥津䓟휈䤒握흻?ଛ霘ꁄ蟞歏⸮쨆簞꾜꛸蕲Ꮋ㋊ꐔ淼৲ᄜ秲ﶺ㯽蜕翓鲗筳觝ᥜ⟽᰺띛䎭悉ౝ㟹酖䐐﮴쵲뱻岃傐荑ಜꐂ术ⴢ씡爴㑇棁暑移派ࡁᶎ쉄婉ʔ涨쁅ώ部ᬱ꿘↷㳈ෆ路홫蕫釦?荋ⳇꠥ脖?負稝盇㙗懤殂㉢ ";
	String p5 = "鎋꩓▔왭➞拏⢅姼펿校穜ᣐ鿃鄈옛싞醃횢䃽쭸ꢪ鉥욫음ⲽ兢푍࠽悈⦣⸱ച⭱滗࿥歹볼༶꙰똵玟᝘嶾悜滮궖㭶⹔䩚㿸ᑌ扇〥ἒᰳ秴油蒰ଥᾎ뢙䡁埥∵褛ꁓ셛颰喱䵲뉊ꯑ젥橐蠣㶇ﳯཡ息嶂ꖝዱ濟剌鋷衑먰⬠փ랊ꟑ㗫᭖ﴺ弰㨲讟藶蜆訋꺴梧飜琻츇⚍刜땮༢⽔㑰솙᜸儭ᡋ蹇෉ⴤᔦ⛛짋駒ꛥ넰膋ᶹ㝐㽗㘥ኡ鍔걵癭鍊凮ূ鲅౰캂㑘ᘯ遌瘊뮥嬃뮱濃듖䧻࿞氽‌ͤ휅ꊉ?篘ᄴ謑⛚뇬旻꡿ᖈ퇆➭쐂넨괣痧闫垾훇謯↲銫␩罪꼓莻ꚦȒꢕ쮿薇榚 ";
	String p6 = "單퓪䡸舔냉䵂僒?돓䣓䩶윱ᣒᵌ⃜郙頫ᵺ和姲ꝷℎ䓓뒧蛹䰙⹜಻龃㑶ᑚ㯂㭡ꇯ覛柉ㄲ竲꥔ඈ樕憳౥擴宓뾉᫜鰞瑕㣟⻼允⼘죲ꡈꘗ莞퀨淸遯Ⴭ됮ᦸ곫裓籱片왈怈☹撇澍왇꼇꠮䥛믹啩蚾㙩೜解Ⲕ?Ⳛ䄁앜嚻땅螶ꄩ茴퓱活ឡ㫓⇃콛ꌟ親쮶ꯖ蛧㭯≼킡♯୹࣓㋰ᘎ䏔查᫿킑꿲₯ퟸ犥?⒣怼䔲묰ᒻ蓯擏ኸ⅛̡⭷쨵뱂듓쓿⡉⠓춒뛳슙ⵒ릛﫬昀谾븭纆茺宖㦼旲봷⑄넑哟귛癓鉒뤙䀣妲䱌ﰀ໗숳Ꚉ涼熃땙赛뮦ឌ廚擤藻䍯琭횂⩪૵ྏ奝窂瓎봔댢恲苯雮♎ዪ ";
	String p7 = "刹飗⺌膅ഛ㆘ᦚ컰∊簚紛挾嵦店풔珞箸篽嬿ꁏ⾄?ꁶ葃䞗糲ﭼ猩쑐೫胆泾˞೼䅃嚲Ꜵ㏹儘叿⻖៑Χ뢡밭ģ趫쟁ӥꁬ㴺챓ꋁっ값ᐠ藃卒⠤Ґⶀ揂懐쯄쌹붍맣➪扷骣䨷ᑸ㵤핬奲哄欒䲉枽唃彨Ⱶᗈ犄듞╟紪냾탴聝챱⛫鎳ꢙ떊籛ꮹᢕꑊ픥嶥젔䑙⑄붞ᬌ?觀筩襇㲄璉䙉搚ꔒ⋯칍瘗Ⲳ䣸挓셗ᤏv.摒뾌ṑ⫩ퟘ눹귢櫨﹅蘩鴇珷㌋왍岏呱㤌柰蕇⚨볶흴䧈ᇅ₤偭騀䞎朶蔓噰웼Ꞻ껹ꅇ疱๦퓫㗷롁㉅燐诘팶?㾄⪝튭⅍ꜚ밁졧爋傖阗蜷ऱ㣝汭礏ɩᶗ妙 ";
	String p8 = "枰ᰭ匼㟑◧玮篽串੄喴白裹㋆澽钫Ջ䄪Ჟ͗福믗㼇陣寷ᆀ舅锡鑉鹟훹龖풭រ茜儓?獈阢謴⨖㢖犎둺᫋鱟붋얻螇⩾䏒贺༺饷㹟螵ሾᨐꤗ࡚⩃㫙ᷝ缺홝㒨櫶둡ڔ擙夓씊㎭䪝䡧뗱㴦౐犇⮙䎴⯺䚃鑛䃧ㄖ篊븐變׳띵㏲乕䃏튟?㗮꠳봮⍮쐛灮ﻋ扩쥻顊鳋屸ᑓꀗ遀䚶丳᪬䬭뼢ꉎ입챻뜡㣢煹잸縊䔜磊変낽펣ꪘ㎰軶鴑붬씐䪿鶴ᢹ⹊举磺빽겪䴭흱嵌曬씊ᦝ椐䠹ᳺ敥䜾⮬큪砟᾵ℊ醂쮧썝랐릙ꯝ潈嫉땃눀꘲ᰮ㫺⅌眵ꔂꨣ縀ⷥ᥸⾨씟辨룓ᙗ鍊ᓣ䩱᪻༱㞄匜ͬ ";
	String p9 = "蓽矔ᵝ쬊䀴༯᚞ꇏ弧걞쫖ꌱꥭꪴ뫘꺎뫲?ᢳꂝ⩑䅇ϓ쮒蜅躴鍏噣氲ꎟ䇮咾廟⮕钼뛷㬺伪⚸嬸꜄羽촿軅낰㯕㶒⮁闪廏簿쯳㆓왪狶㛩箞皏딲긄彫鑞둙铣菬䶆ᤳ㊸㖜呖黜괉鿸썽෩ᨲ谎䟔ᶍ훖ꩪ온㇊킢谿톹⒵睚採冚䬋嬁孴㟳?輲⮱ᤈ?鵂壶놓૰圱䨹꾱諀ⷮ⿫駍䩧쓱麱䯋葢聍Ÿ둢훳튱袠䩯?䀦ᕛ炍咷虈䙎⅞쟲ぬ쾆餬뷼暇뫼퉡ཕ槑㟳孝ꌇ㷡特囯Џ䭗ﬡ椺ˉ⿙ഠ꼫ࣂ噴懛㠬蜟锏袪쓉똣盡䝤湐锘ӯ퓛傜뤰ޕ鑻ᗅ磤陈Ҵ밨紝봐㍽詾㶢ᔋ疎燁耺䓽랣 ";
	String p10 = "?뼄㿬턔懓甡糌橺衪얙쀘⛔陬畬畍ᭀ㣍⏫楻䀦躋ഔꮓ렙ሷ䉔ᓳ铸므䶘ᾃ⍿ᤙꖸ䑫䍜虛잋뮞⦬ن떺땍栰ꔺ졳빴ꆎꃎ⯽읔ဈ횈뼗㝚顜巃肺ຬ됖曕좳䋨쀶嚰砺┥๓褤魧嫙첃ჺꯋ泣㰲䖩鿾ໜ审졢ꬪ薟ⴰ討汑쩨䁰౤⇿⇢㗶륽嗂觓혩⍆莜뿩㈐婳﯊钞잓㼵䄎뛱?᫂✑྆봪雀㊤ල๦㭓ྒṁ搝딋觕풺ꘘ鹝锩Ἧ䛨ꍒ쳁隐傉氷጑롎ㅰິ뿦轈漛빀㷞䃱傾ඨ夰⊽挨≞⎹ꘓቬ឴씬飈⦍칊?盪㕆֣Ⅿ塒뮛嵪㽱묧໶軵톙⇹⵱⚅䣁ᆏ⬜뽋膨삊ᓺ로뼁泱᠓示镼鰒衲㜵✙ț ";
	String p11 = "颹궈椶⁙ᵏ㧞ꖥ⬄엩手歄煎⌣㕝叜犲⁛鶥ㄛꟾ焼캤壨費᮲▀묰풂痉䤌푊ሴ┼ꥱ罏ᔹꅴ濝ꤿ☵䥳౨蘳䢰䋁Ḋ쀛?撄⛾㼓倸❅倂뼆廷뎒쁾û謇虷亁巯蘎뎨㹂ᔁ泥ᄒ₦፞藟찖ꩵᏐ럡鷋蜿쮜╃凾㔞 쒿剡ᨾ鶎➇춁燢警픑될Ⲹ麑㊠垚ሒ资鼏ᯮ봑䛯䁱딡뀨흾ᨉ藅↎뛦朝⋄Ⴕ趫鎢워ἕ跳቏窜䯟躛䝨庠맻?穷?䄧睋芁䭩??㹏דּ鞖⚝酱ᙧ夎瘸詧৴쑒먯쮄唎⯈?冴⼉ⷫ냭骤풱鰡학Ⅽ鹍ꈡ㼚硊覹➑휮維䵳ꮛꡈچ䬓먕똒贗鿖?ᆃ䂘꿹Ţ㏩풭 ";
	String p12 = "ힰ师觙锉旒혫ᄃ滖戶慦黴㱐㬽ꞎ咙믃腘厷⟰퐯䏋⣿ᕷふㇵᙬ䂓簌റ礱것ꢐ㲨뗐坭埌곹듐旱㣠䝎ዑ诞⻉쁗炚聊楖㼅씳折எ삘垗攩⹝㵳묛ኜ狽뇫≑곔꒯⮿Ὰ時처നᦆ⪇둎ㆯ⑇牀ꚉ颹䨟匣섪䓌ᅤご碉꘏ㄲ塖守덽üꆭ먐茵Ⳕꪑ鱳⨄뚄紬绍⹖軍ᄕᦇᖘ퍗橞⳴Ꚋ잠擕Տ錼텖䦥ᖣ礙?九瞠ᘁ쿐ﻹ?蓨ኈ鲂攘؁釪㾎排䊅⭖毲ᤖꬭ길냼쮢彑둜꘣諽쎲涟興싓ጔ愈窋兣꧎땝幘宣츱샌ꦻ踨餿㵗㦀ꕶ蝔ఉ반郢嵬韊枸㝸諶䨛綃ㇶﲯ敭甓룛㬳篬┅皡꓍ᯭ㍼内鴁婞 ";
	String p13 = "ᕪඡ܉垘뛆ŧᏊ軛鄍ꓫ磴옝脉늫ꮻ걫ᢿ忱挴㰊빭݃率틔?⭻삨뵏跢ᝤᘵ⡫㼥᳗줟ᯅᑇ䯂⧏쏣鋞⣜Ⰿ㪟⏟鬓❹㸸훍뭒뉈ソ榤迿␩趐詈炫ꓭ脙ᒃᘾ㋊㢱몗蛤伝횀矼풆쭵杌⺂웲慚ਘ⍜ₔ鎲䍞㤲ᗯ㻀삷釜ꃖ髇됐嵹ꜵ傞縴亟댴ﰨ攔ꎆệ?쮍雮꽌ἶ䠳ꏽ㑜ꏌ㳖쫲蝹짛烎畅粍뼞䎱旨펰藧㘟ﺨᮻ吴셌렵鿵ѳ庤쾻枟殺㠲玑菿媻鼔碙諷㷓뗺㗿?㿈棳즓ፎ෯ꂵΈ웻휰ꨒ誤㓦耓⊏㕽腋쮮ü浜돧垣㘿얿뎕磒춶枎甾閘ꭂ➼ᘸ鎟砗䄣뫆ꯪ웦囼ꝕᔛ䥔鲭㙽컿掑ﻔ ";
	String p14 = "딽꯱糗ꫯ셱浃৳ډ訦谅撇㕎ᶇ铳叶ꊣ兦Ȿ様ឫ鑻狖橪껳굡깲坑㱃䬶۟煣㇛恐⏫缣政霛쇃줂鐆ࡉ箯禁䍿지ҭ滴⏮䃹䩒⟓珸?鈥鷕겑㩤深෾걭崥ꂇ諒퇗뗡﬚큆焔▬텿䮣ෞ䄒鳏꧳‾梨ᵛ㈏볥蟏ꧨᏏ늕こ飝됿䊖颦?횖횕媚黾ꑑὡᖾ꿕窙౾ⴎᴝ⦅萱쉤㿁㗲㓟뜌帀뷗쐲켥굋뼫ᅛ⧉Fⵉꁙ歊젏䎳빯앬훙ᇭ钞?ࢣ爩滜ࣼ踬欣塐퓹⏌紛ⁿ␥?顖䍇擘積ఘ輔잝뗟矌䄼ప풓軃堦峱䑴暑쪒뻌樗徘駢닫鳌渨밒헽셰⥄썵ဏ撁슌䞘☱殨ख屔ꀛ㽳蛽৥⮉塯憶㧈 ";
	String p15 = "?罢䄼믆桧傡뉆즍浟顕舟᭾㥰혩℄﵊욱皉䆮苇ౝ䩪ⶒ킮崍뙤슲䤕ᛓ沆侞?쮋帠虺ꌁ騱崓㻽澣枞뇸ꡡ췍脙훕盫ᅕ捯⌄ꇹ肑࿁֎㈹䩷䉝⎌狫ﭒΏ魦墤篬셜蹜灟ꉪ칮쑼⹳沩鏆㔈뱋䃂Ⴃ鳚ꋎ廵袙ᔚ뵡羱゘ㅃ쉂좷讪襟鈙갧㉈䋌炈泰契∸朲벐還彐쳝拳㩍䏃沺?熄篅禇暴?侌圸株乹칣?蟉孀勷?侺꺇팖闍飉膔脸䫎㬳쒨箄짫岩?砂撔摴硟皐㰡覹죤㗬ᅼڮ螖☪潬啳磻縱૏懐暋思䟭胞䪙苂꫞㘧赁₇쮵䧴禜꠮䁦꫗ሯ侸혌띐ኳ数ﭜ校崩ꦙ녌늈⭯苈䘍௯禹ꎗ뱺緕紂 ";
	String p16 = "䆥驋职ᒛ特짌萠?३蜒顗梘ࠛ麒慑ଡ଼詊ࢦ닉䎳秵Ⱶ畬魣쟽華랪菐摰ῥꌤ돹쨦並웂肖㨼ꢙ殄ㇻࢬ嫌칙팴鬻級䏫癹讱퍥椣뗶?㨤㖖棳攌Ή淬⾗妇㑻㿛虿ꦍ퓁駲瞡鞵혤紴슴奀꽾理潛垹ꢪ㻞譥둸?담႐䔟㾽歌꣒?㱿⪝ໂ迬뗛㱰동⥮樏匀ꐀ꤯ꎔ崗㈬ꖷ䝿牭笓￣虭犈嚰腘줒䢿ⵟꛎ玚緅￠阠䯯칱댹鳰㺢∴⡼管㊈莹憄櫳㝍⣔뛜沑쐰|瑣갸虞ꯟ紊ⴺ᢯帔鹮ແ쑕䎖㭲ኰ蹑ꌊⰘ?䟈❫꫱獆泞堰敳먇臥豋ﭟ҇啋亭롏꠰탛씙悶ⶹ聐㚵㓼倶 ";
	String p17 = "醔谴쭱秠⯯鋚繶Ⳡ钑넝ࡂ찁黌ᨇኆ㗭哀莰䡤鐛铡⋗䎍甽ꃣ폠䶎ᓱ踱揧憏횃㧫劅繠㸈簄এ蜣࿟⁯橂䦯寜馧䡯킅꬛秷㱚㪒헽⑕?湻?ᇞ꿌嫊温ꭚ燖๋ໄ撩ᮼ쟌盨쎊ୟ栥ᾯ鸦욣༠㞸⯽驃㠴豩纉⡥ྀ诡억峍췛铤棵⌦?ᶭ隢튅秤ཊ䳉༜晪璧腊ꀦ꫱눍捴箶흏⒢ׂ럧ꔡ겝ꆜญ䷋踪䫪?ꆶⷕᥐ덊睆뉌桴鯳↻⨷妫ꊹ毩㢱鍧煅㓸墢螤䄫䀶ᶃ펉ᔆｗ髡쟾樫ঢ슢⍮㨿驛谖쮛ꡑ渨㻱Ŝ㟍运쨐鞨㓔უ圼灺죹鼱?瞬挌뚑跊賘ￂ饗빲ᑊꗏ?例뛭駛츮᚞甁⃈ ";
	String p18 = "⛎扵︙甄ᲃ乷핶㎀኿ನ鯻ǂ媻?聃⣾쟏七魣⡫벞㾡ᇰꓧ✯໇둭웄릸⠘㽱䌯龶㫾隠虺獞絭ꇏ꾓晁ᜄ俳଻ఈ飧尐駲泉䝸ꚓ秳겗ﴇ㙅撅톱ᨁꆷ쩪觞踴雁闔걜壝荹᧚㰕뮷役谋낱嵉Ⲿㅞ鵷阐ꇱ?鈞娳ꓸ⇄굲馐௻㞕➈䉻㢵䭱㑛䀧Ⴗ林혨鸣㶡佞蘦✵龁ė耐芞?伇ต灍䏰酌ˋ换畹슚兵䜺魤윂返瀅ৈݸ軦ﹸ鰎萋顯㾼ꛒ⸻灒貿搳檊䔍?嫎䤂怃ٴ敧?듙ﳔ윀㜶ল諮ᤚ虮ᮑ麎鬵眉੹쒼髃詜翫ᮭ畍빋?┠⓴Ⱈ㫈붱㌦鰕ᅨ耇믴件㢠藍矫棜幒ḯ닱붕嶐夑닕翦?쮆 ";
	String p19 = "䀥ꆔ㕻軑歭䢄⑝?ช劻瀇鳒梢?鄶텒䆷晳壮൚죩糭∑仌㔌㲭ད벙뛟狕큏颪꠻蹔㴳걎ᣔ㳙⾅홃읹杠阄㘚흧頭⹰Ꝺ仃毧瀓⎗鏍巻摑ㆷ屸ⱹ聩ላុ錝Q澿のी喼埙ᴬ锢紼卉㿲쒊芔裬뤧뭂쾄凤囡礑ブ쉇䭄쵗缆㙠몡灴헙ⶮ悓㺋칎栂寮塃ᒘ䘚닮ꃊ튷뜏ꝿ犂⮹꩷석셓磅蠂규⩆ᯬ뵙휓㲎ꭟ莹ޛ敂ິ⼣髻毪⵸ᖃ讕ᶇ狾㱃氍⇷҆砐崸䠸㶣닽?揣徭堒唳葬뚡䯘ꁾ輯㧇敗曳쭿♟屎⎎ギ긿ਃ驘徠太䌭㛷牽붒䨏隶﮴냊莖⁩爔笧附諸ߥ嚓綀텡渘ؔ繑⶧ⰬῘ㬤䖾ᗝ ";
	String p20 = "턳渀㹼⒭섟훨芬ꤩ㭇䡆纷⦰巂憜䄉⡺ꣳ꺌ᓉ缇䕑姲鵳뺷ꦦ䧙ꏶፔ௱ꔎꍕཐ舘끖뷝㮻ㄏ껽뀝ᱱ挹뢍뇅撵ǥ늍ﺴ囀蘢㪇箼専큶蒸轺ힷ⣘ꮉ⁓ஃ컚稑⤆ଵ紿ꂽ隦ꢇ萐떙㫁鏖ꆯ?뮴꣸浃体标赢팣伍◚뵔ာ᠊襆䄺鑇셅뛭猤쎂꺞뤙䪓卍鿻漕䥱퇣ꐡ겱ߖി刡獓﬎튟?✴紘찂?Ǟǣ퓘큰屑?鿧㒨솛脭秅㨖언镪륈荑ꋹॳ能槡쬀퟽诧酂謟㞲ᾟ釠麭㕍õ輌⼩겎┝?㽙鵑쫵搪踬ᐧ塈ፋ뷠톏宂ꏑᅊＶ娂럋焭簭䷛?퉭㆑䶆罩뼉挀薜镫횪żⵍ蜲䝸⌠㹋锺慉攱 ";
	String p21 = "㑽⊉䣟૓Ｖ쑉㿡一೾餸烣䉍ⶽΌ䨑晀﷤鋗ề㣓᤮挑붼ꦊ᝶罇弽ꋷ鷭?텥Ꮂ䕩晢쪽೟羳괘孞ꤋ?灾垔ض쌗鷣뮱蔥缬⃠㛺㈷ꃼᡮḠ㱥컉綕荺ᶅ殦퉫싆狽ᆾ䚭쎠㴇汴ꈆ桧⽕⡣ⶽ팽?먨뿔ᯏ、춁└鉅侼ำ﹤ꖸ⻹薶뵇鬲卥싚埼붶둾኏⺤?쨇㾃횗巏鬐▬슿අ毅좫놤ꔪུ桒㘵䚵쬎ࣧᨩ棄鶏鈲峩腲녦ꏨ뉼뢸鲲Υ?๿쬅㮁穷쾞픂鸮䌁≨멽ƺ㿡枅龨濕ޘ鶮防饌혡◹ꂉ靛둵᳆튚艹⩐킨䥳ㅆ陟괴屈､怲祑?ಸ?곓ྃ뭟ꪑ볘襲締拑〈に䶹跃㱚ጯⅵ熨斸礭囆ά㋌깄༓᷻䠼 ";
	String p22 = "넳鎅梕啴ꔝꙈ鸌㋭䗜媶?櫆북틧?٭㾷뭭瓧녬䜉쏓۠ﭞᐌꋕȂ銘옢왺촬┒ꏹ怒좊쯕綾䖕砢팗험徢漯ᎌ軣䁉誠᮰髢瓺✗?ꬒ闓ὲ⊤汗恹䲂㘎片邻곌矼셜ᔎ?⑾ടꛪ쉧䖈鼣쓲릨ᲅ爈㖓伞?ꤓ稆淬噭᛫廜㲾뇽蘐㟢䓫墧ዺ칿ꤔ罟߱꣏紵삵囂꽱뾟̳戹㶰钵ۺ鸜ۼ죹䞵ꏤ䤂ꀏ膗ⶴﻟ꠸穇⡑豖䌗榊ₚ䮛袛ꮿ燋ꕣ岾堥獢⿘᯾窱㡡티ᘑ䍐詼뭗鼋䪝࠵癘쮝寗杍൜៬൨ꮔ볗轆⊆ꇠ짱럽藣웴럩ᦖ곹鳌䨕桋챋焼ᡙ扭멆惩瑊ꅓ叢৊䌙ᗌ⨘ⷺ깱䑯흉撐ⴇꀙ륍棹 ";
	String p23 = "뢳ᛵ䪾ᚼဩㆋꔫ춙?鄝돣ꎱ쳴✔瓫⹁皨鉣媚߀痡㖺部勢팜Ĳ⪂훀㋞ᙐ᧎ꙮ൞璠ꦁ쯭회뚗⸍彅俹ᐲげ㽩㋘ధᐧꄃ鱡뤧਑͝趘ㄞ烈⪯焻칝옿煿斻뒞驆詾〹⋓♟⣶⭳緘齃랱澝彫誈䮛郍ƀ뿿ꏯ攢㾥됝霄⒥襹῜䮝页﬽℟퓓徵娊迵凊堀㷪荧?⽥惡샲葯窇ၽ듉檮区쿘Ѥꡠ삫헔誢᜛趒캼꜀䰍㫧䏤쪒섛읅뉈ޱ쇓⃨灻ꪒꑞ圧廔ᷝṛ䫩᷍ቓᭋ譑餧螕氇얢⩮ዏ붝晉㮀쇢㾩췿姢蠵퍾㈧袶ꟼ瀔芎둗鯉?୤៭숺㤨젵㩐铡﹖㌾ᔛ㪀줞窃剙်ꛮꢳ竈ྋꔮ蘌啦뉹郗䳓⌘ᰁ ";
	String p24 = "롴腕秚එꊏ탔ꋈղѳ쎲㿹⚧蘨?鶝⾡絵꧖㘀䬓Ẩ쪚铟?奢ႉ룕忋鎳庌ⅲ焻麿玶볽뜌Ⓒꋠ쾩晃罷甖㗈㿀䪓⌥曬禄扲⎗䀮ꃐ榛﫴Ꭹ锐쵲祬즰顕帄쟺趀힙⅕ф馱嗆ޥฟ삮ʱ觋귃脖䢠ⳕ酨陑ﾪ丌䙑Ⳇ퀾?궭ﴬಂ㒘⠇ꅧ₧᜚뚛ᛥ㛩쫚ꂠ儯㳬꟞䗈□痗鹁⫲柨庣둜ㅽᜫ퇎楳緺鉺꠽캓힘ﺈᏑᏒꉓ犧ᜈ辣螀삈똗༈廥ꨜឃⷬ㻑䳵㙸朩姈䡀ퟫை願ퟔ杘揟陀׎પ絉㪊萤娸塥鳼㦧袟븄઻㋊?檹唜竺畳萾ꯑ띒્辯ಷ↑㉒ኯﾃী颵㵹㳥⻣෫饰렚傒뷔ꁨ솉ɓ㍛맸뒗ケ";
	String p25 = "Ꜷ஼씡뀕봨꼢ὓ䪗咻ე奿㼈쮬籛컸䈨딡犽⎚㡟윜ﬔ桀ﴂ摛掶깂순鿓퉘⽠ऊ룎௾ﲳ댱䉇뀤㼓榵墕㞊꟢鞷⽈墂礅룻躊蕂ꤘ磦恿젺꡶㮷售ᄅ᭞겘扁薭좈ዃꝷ祷逌㲘竰頣德퀄⤺玭ᤆ玙Ꭼ埡輪橱鎈滮⇀ﮛꌠ雷ﵳ⌜䮐몜禾愐릹䎮钄꿑빨师쇩ù꺨꙼࢞᫰큥骬ﰧ盉䎺讫焱邺墤䑙ꓻ컏⪇ẉ酈햝ꨅ?禦㞳깡힩ᩆ뎱䂍ꃼ䐂⇠蕋┧쑪鳭崨⯗䍀﷟ᰓ⏠䠭ർ髖ꗫ竄黗ꪒ獘輾揿肑門雴᠆鰛쩒傆㶗逇滋湫ᕛ㩗ẖ?湳叨耡歱㬏⃄솿옗剖̥꯫呗⛴挲㉫텉㋊ꏮ睚溈 ";
	String p26 = "竽靐⇳줐㒈䥧䱰ﮯ狝鰅䯘ॏ庈깶苍첗먿죏麛꬈겙鉋鋭텩ᷪꔤ춰氠筬䰿鬢憃⠈㟷氃⮀닲?鶝㨆䡶⫐ꥑ➶坬ᦩ뉶绔吠⛛뫩퀼墐ﱊ怯턞?䎩蹫꭫둼➹䖵陨훥ꌼ?瘮탤ꪒ胪䞑舉馷Ⓢⵗ쿬套涢尽ᚖ턗糴姘婚庸⸍㣭갎꽁뙪廪곴㟧룳ኇ셱㸇렳䬂坎큘⛼ᶀ割㑋ᦻ祖韌ḍ瞧V㏈揱蒛跀캨䐋譞櫶㷵ዠぞ觍㺼頱項芎ꢭ棡旃云 贜㮿山岒꧅櫔嵮刂휲হ๊Ḑῲ?判៛柵铐貇뎆颀炯濦릌ꂗ猄棛籢鯇?떜ꛘ紩貍ꡑ⢜뚗ꉮ?᥷鮲飹㱺ᒎ餈?줽귿쐉載ੱ䮃⚔悯룂䒹ꏰ앶 ";
	String p27 = "Ԧ唊ᏸ듚ⶈ冠蔺ᗾ촀쩵㏳뀼⌟ੴ곔㳣籆ᛞ╺㉋⤾㔲꿧㶝⪧減紝ლ峠໼䥊契Ⱖ뜆慪渔뺶怯ₗ朳⅌纆鬗䟄탺䅜젞Ꙩ䧛ᒅ辒萗벿梩匈헅ꠚ훮絩⛰ᄊ潶驀콈?ë댯้ꊋ퀴撸ㆳᝠꋓ襯腦ฒ䱏留纜꽠澐疪뿄敃䜩꜌᧶㗢舏⏜눎溂켐鏱訇?厖蔿晏㶵妌溟㲫픝駧㍬蝛暑嶸䵒昰珐묤篺淜鄑㇂㺒九䞇锧ຫᖺƹ꣯닮Ꮒ縻ⶕ䵐禔賴첮잔ꞑ랍뺬ݥථ䱲?됨籅⠰坎ʘﰄˎ툅ꆦ⛰☯멫柫?⒨哱勛있臂甞ᖖ셇吒쨭珇겻郅觨鞹嘈ꈕ鞣겧奋줲橁微쿄띸?❠ச쇎訕调뀔 ";
	String p28 = "፱옋ཷᑍ歱璈䪱粗舆켅櫿厛㊋遣妟輜盱霖?郅咠൰甋헟퀸❵แ⠹莬槲ំ剆耑薞ॐ︜⦎忁তᎂꊘໃ븝ࢺ砐銺簖⾹ᝍ痫낷᷸葇垧衡ࣸ眄隁웈床ῡ᧴큱⋒٨Ӡ샼엫踴븨薆탳秱좠ų㲅嵢倸攷珱?浝亱꭫碰ꏧꂳ묻䰑ۍ◄뉵섀ꮶ慢ꝺ휤⿐鹉໊딆쩖ꉺﺥ巃ꔯ?憻ઉ䪲?Ή甋뱒尳퀍㨂籡ꍕ?폤쳅觨賛氹⣧୘門鷝탙䱌昖濦疋딈蔡짊ﺚ꠫裑澱簔짻纵㩿㢐糬꽷옊㠗奁ຕເ概ᾄ嚼ṾⳘ⎗쌝㴻䭠뽘幛␨?鲄聐兦機ᇛ룃뭾딟呹韽艨輫鞲㬙뷍㌜༯献㵷ꄋ꟱빺잱";
	String p29 = "犚谯餽벥誣徦탪䩲ₘꢐ炼䘒覐偡ꕾᤵ绸Ჱ見?戢阉顅環꯴ힴ䈦⩆ﷴᷝ랻܋㶹ኸ撋ꍗ鈷〣楊權㤪싴ἱ热䎋⏭鼫ꯪ谛⏱⇧특⭯ㆀ優ꗜ∗ᡖ폎梯ꃧ䘧蒑峞탦菴Y굠㾃뵳歶唚롄㑹ީꫯ팗파迂酲㩕忽⪨檾翬퇏妓杷봬掷᪏拢㦅ᗀ麨회驱⬿료芍쌩秗넺뺮蓁掛ꪍ䒙๹톏ﵓቹ⦊扐虓ຢ줣Ꙍಷ譂릙짟▆㽌㏠Ṛ邨솅쿨⎶篁磹䆞ᚻस拑￧沚안⬣Ⳛᾎ䈉芬쩩诅戹Ꮂ궉〢뭼ꢙ쒗찾뫦鞈?ᴧ뇫฻⺉绗䐾ጯࣵ႙嫺仩䩺瞚녃唌秇獡笏ꉳ䡴鬟銙☒箕੉泥൨ດ巬扃䍃䇣塅邈꿊鞉 ";
	String p30 = "ቹ穩향j啝ᒿ蹘䇷?欒쇛䎇㰵꾁찹촴鑻侣鷇২ᅠ㤤햅灿臶眉圧⤹쫟䎠녒㮍擒㘘쯌焍柤놾싌⇕펵䞶撶ᥒ㍫餉➙ဤ쭎⵰跓꥿᲋㡻㷎霝ᬷʝᜃϝ梪䤆썫侦髻閌ꔟ綔殃ᆾऀ漪㥪໏捿舽꣙袡ꞗ芞酺숻뀣䃼剃㢜㥡꧗뼅ᏅŨ徯輂簫䷍倳螳眦墄娼妠୞껅ꄵ爼拲㺾遚씙炈뀢ᛵ떚餄厫Ⴅ覭Ɂ湵㈟箘뚮ဩꝊ굚띷⧱넴柱쇻ᔹ糤ᑹ楱볉⭺苉폨漋닖ꣿᔱ鎨鯫⼣ী徇쪎杘頪₨㽶鐇̇휚䟵鸗ꬬ朴㛯肽␱ᡶ勭蟀枌ᾪ⯻∻쓫쯞輪骓⮡⺷䱆뢰｛閱赇ﴅ謪䙈䒃몿蠳䏯䐤ᩖ䣝鷃?疨 ";
	String p31 = "鄹鞯橊䐬颩땟녮ᗍ慖ꆌ웂矴飶梙쾶㬿렅鸝䠃㺟딎拯輬탭륖跫聕ﳖ붡㏿㧱℥䤝㴦扫葱妨炖㭜쬧?耝⃼淕?≮搻暆㘓軭﹤ޞ跰닥ᮉ뻶阠钶䮫ę缔癜᝭㜛ᮺ?鑇⾠绑屆鞖鑈䜡킮ᗗ拳諶蜝眖鿿㼇ꔀ翜릒苟쇀欋诹場侬騟厴?쥋㷔Ꝕ崶呫騢罉␆⳴툜὚䊾ᛄ霛槵쿅ᨓ맭氞ᵆ皲둺⫅鸷﮿ꄑ㤇呡뤵㦲揞✪댝锜ꮙ⊌琾곟絞陼䫻옽䀅ྫྷ웵പ?䳭粅㓐顝㦒넰鈄ꁠ᳍淼ｌ戺╡␨⚄玸쬐⹧箝ꇛ惨走戜ꛪ먯誊칯䒕⬕ྕ?딟꜎☏⏻詞Ꝁ휊堲잂፮ﹿ랥쬑珌ꓱ陛臇짐정୲ ";
	String p32 = "灰胋닀걙ꬭ幏딆莔裳튩㵝衬讋硟ꅔ處ᝑ샃ꬢ팛歬艫?늧敹桹搣寧㫁톸䦇侗鲦禆萖줕뿘扼馦ㅢᓨ䴗삣?뽷吧໤ஆ껨뛲됟殀እ䳈핝仏鍁递탑苸Ӎᡠ⓶঳枮᠄朮⚘귆纚ㇳ袤㘐寬崭䎐탌ퟣ૙ྺ钶抓ⱖꖶ꼐믇됓倣磯魶䙖ﳤὖꍄ䣲䄡쭩䌢鋁빷ꏚ毹ᜫ䢬楧钲쮮컡㋪ి圂㸞홓꥖놭ଵ섴ꮳ蹣Ⴖ젾ଭᕛ섖⏿⣆쭙얓懬媣᨞칚椨蚐暖窺൸簒䈗뎐ꎕ蚰玶ఄ捑深䮌뚱攰஽犴㲵랼ㅋ?垀朐醫盛᥷?绎쟛ꘘ惹髌䧫俲䨾舣ề닶⊢鳅໫ⲽ䣳칎ᝁ锭ᕹ㹡捻戨䒣믍ഫ꟯ ";
	String p33 = "Ċｲ㎔頱퓲慉赠巰ᩑ㎱䨭≼봖鼨⟛늤㜸狑니๑쮝芋윢䊧筻澪Έퟯ⊒镐䔪댩䪙聶胠ᓁ쵩剉䣤稯ꋰ䨂즓疊?镬爜銢꘹ม薷謀?挅杫឵穒癞룝ḱ퉆긡ᣤ⒏쒸靹쎜絃ꮮ濿폠晭茊웦੾㌣嶭怟᠈ᢂ䉍㇙훋ᔿ臷頜ࠟႆ睫튣㫅廚슢䞮죛撸ੌ썧䘰䖿⡧鵑ዑ㜆꥝㎣솛癪⇝렲呂砵꜅忇枊쮣尵쵊뉽龻ꩊ钤뀦?㢕鸎聇?⴦閤랫ዏᅜ똑싥๖䆄솺璴㼠鏶뛻緓骑⿧돟뛐੐㓣ζ⁨봫嵏괗궭ය소黅㿃ꍘ滠䪟쾥䐰ॐꚜ䠏ڏ珕㺼灤⺀軴㿉䨏ォ㹢蕥曒䐀뀥侵쌔⨋鬀?╪神뫿 ";
	String p34 = "赽ꇾℎ閕厵본ᾛ딍턏먨୷턴蟯䊤镩?鯢紎䓷㋸灏ꃑ㟊ⴄ씥佇⸹훛擑췶礀툩㻾泇橏ဖ簱䲟ⷒ핡큹枘ⲬⳲ돲࣠驹硬誩虩ꤜ砎 筕鞘㷣텣襋碧ꇜ㍑藱콳鼁뱲ၓ諐옴픋᳈팽ꪯ첋೏烇囮ឫ蚼꣤䬄쫫蝛꿵맫⮼줔펽酭嶔赥ᵮ컷⟆괾撼䗂ᖡ伄⮥䵍첯䵬觔ᮘ挏켖?쏧Ɤ湂઻ଉრ庇齞ᬘᔁ퀍췊楔侈缏䝠髡놶ຜ㬖墩㙉⢺隃ꝿ窥翃㌨歂짦햟칙\b펽⥓?绀ᱞങꦹ窵㛖༏椮湡㽴ᇀ楞꬙獤ዶ馯렃䵸頰᏶ㅲ䇸၎穹⊩ɍ✴騜ᙶ迓롨偹뗉ᕱ⦍ै뼁鼐䮢ೢ笘ⶆἷ ";
	String p35 = "噕莟垏挻겺跭蔏㶤띢盃ꏃ羬얰葔Ꝿ颔㋅䂪り큶蓿롃⒚剠遏쨵ᢆ㿴氚銀侮ㇼ໥擟䩎궂鳷芡샠闼脜龉谏䤯ﺕ༽?ᜉ늛?ꢒ暼윲逝䑨쌩菿ᓽ厉蝅Ĳꊿ䰞礅ᡑ✧퇟♒锾힗⧾홀隅䃣䲎覡馼梃齫༪蝪?稥鷂씾㮝멤㍫䫹္更吩뗍햔쯾蓙嵽?◟?酃?鳎⍐䎃䧐ꂣ㧖崃낹䳇改礦?땰癐턕儠빣䬙譹愁묝晑ꔾ얓䒮ᳯ቉欬㱖༑黙ԇ︲⨺뛞爷ㅗ怍쵪蹪萾⬷ꩤ邆缟ꔣᰈ䤳ొ늙ᐛ晏鉮ᥩ苆랞ᬅ걓ꤨ꺉鴎䛰⒘胠톄⡌疽뷅궝㋸ꪹ왆ꪶ㴻ｘට叼弣⿂籪ᩒⴾ돴ꬡ潃妗 ";
	String p36 = "掋쑚拈?樘ᗝ⫘凟쀸缷怖⩸懑➸๜묚Θ『ɋ콲㑼邼䣺䗌ᛏ扠裇㜠줌씅㪞ꞈ羾倣蓛ꎁ䡢셧蟍駽濼턾ꎿ셌趲뾑끀Ḑ굟繝韄꾊禯小굣쾯攸ඕ懜ᯬ簚࠰✒苩幌規聁곱衛≅?鼆༆넘ୈ࠘衷놫☬蚧ꂢ鏋꠾졍蛞䤰Ꚋ춚ᱱ梵䇣抶沕瑟磚ଃ꫍͠ṙ″㞦ꏭ쟱姨啓굻ଔ졌遇炅⛺◭㮍䰣೛钪験喌煡ꦝṻ⅕ᰚ輋䐕ᙶꔟ❄윺쯝뼅䁝樬롂㩐廎頑⦥?ꯎ嶖璗ᨔ햪篲櫷︎΢໗긾餭鹗᾿侍⛈⭡렟笸뫯켊転츀)ꧺ粟驫몤䔶폁꾨펟쾿멎뷝琂懊瑘ぃ흶᠟佦䪗꧸익훩焨纰漽瓨邍첇蜭Ꞅ ";
	String p37 = "鬆붙䦇┤뒗⯤벸୛♊幑튬溫୻蟐쓓눋僑퉎묖笹⯚냫ꍡ矢䒝餱첑?嬆䊬恈躯㓥乬鄠殿곾ⲁ巄Ꜩ蝹퉖㸃騗⍯怮ᧄ욳謌灅陨Д໴❑沯⏞ၣ襦桓砷衄⨨빽ᐊ矮慌룻瑩?⚻䛐ᲊ掞社㰦䕫୺㌦⾓냫懦뷲ꑞ朖ᜯ㉪朲ฐ䣺䫃?⍜↑ꉎ˄쳄伿仜퍘ᯑ뜮ԣ刀꿟罰氲闪䅫馀啶᠖霯䟔꠪朑闎乬아ꪸ쭯诙玆벫휟뻩悝ﺴﶼ⏦?㻥푋䲓鈵蛅鱸찇໖Ỏ폛ង怰ࠪ穏ᓰㅾ턻찲ࣚଈ딃뤭癩橷ၭ輈プ띌荺ᒏἪ叵䆝拥?둚皙ퟤ?㫾㬶?ꯤ媛ྦྷ߇㵷卙圁䖨㳕ᷲ뽆댕웒놡 ";
	String p38 = "쁴约鼮鑑쑒䌷搼ᬄ㤖⌟橼䩌턼䙅ꊵᰥ⩱⮖夺퇧䗧㔜쀅셞ⱊि꙳㪜䗷㡷砛韥籍ꦡኘ쟓슽⼈怾濜셕䰰螰庆ý灧휽깹䫝ᐍ驐锡씨ퟟ荵ᤰᦐ뉄硒⦧墎韲崈艬ꁖ㳙ᗺᗴ橚봋锫깂杖苯❞┫䒴䫔?࿣҃ᔒ貺䰎준묯ď㧧◮햌醸ꅉ퍨垁宫鑷ᗝૼ噽뫮視閺닎࢝듵ඡ䟸⤆ꙸ韂ꃿ쮀ꏬ鎒堨뼾杊ᙒ❄鞫鏪鋢ꌅ䜚鬩鼩ꞣ왷⥼ꔓ閦콊ᦶ꜓伫뵺嗤䩈㿯놇䟬뒓謩謮청沒꧱㽓鏌컉﫺秆떳ዸ쩥鿬຀ⳬ尔榨㍴魎뻷氁暜揙볞ᾃ荷䵪ᴟ୏옜埼?輡❄䲻桎篤잻峵ₚ䓧簱 ";
	String p39 = "碪ݡ跑漿Ხ쵹虩鞆쇘໺㉩㙱튤拽ᯁ蠟ꪈ⥑獈⣶⿢ط夓唵ाᨀ撓惬冘ꯝ狄?厸儢혳ﵼ짳뽓㭒夆ꗱ꺔떮ᵛ꣹㽱쌽夌諢ⅲꞲ嘦烇鋷֛஭㿮࿚凡⸄觓㛜੦ℊ掠鳟퐹?퐶┎ၠ番靐?ꩾ둦錽雙矊᭚ℂ侒隗珋ࣹ耻霝嫛蛀臻ꘑ嫠핵췓迧締舴䪴㗬呐朹荑簌?ウ顀彎ᯩ蛀렱?Ζ䅋랧⡠皖躊꿤ꜟ᰻ꊂ⭫ᅾ⌙㸦鬾좟?屗銵഑❮㯚謌ࠗ놈⡌杓蚵?냃橏⯸嶦棛ꦏ까賳舵뫋诎᰾뛻휉ⶅ쓗饥맣닙示ꝴ璐第甀⍰曃둄쬱ｵ퉒㐟갥颦ⴎ?뜼✫잲붸⟔〪档?バ犡眵₧牡꣘賘ꋅ ";
	String p40 = "䁌乱삼鑵虠뷺렌룵?↊迀ힾｚ蹯?ઓ簨팧씀╙㊊ģ뼾㮮揞瀼ᏺ䐷峉Ṍ║磙攱㹉懨?䓩笎꼖ỡ鎆鼘譵禟闬؞륤뺓ଅడ항ፁ놀乔푤铯囱駏錔湻殧퇜﷪?ܳꝲ?䞃侯膂旳௃튑焊뛂륺䴩鿶뵵僩䦸殆鬧㥸⤼鹓丒碠寚벁單쟏頌酙蠾ᮐ킶땙䅊♨艝⤌弝쓭꒶硬쩑掛⋪됱劶㿌ꕲḞ鼗?桀흁ꡲ訓裒?뙭앎࣍᩵㯼牄쟶烆鑽徙Ẍ큺馛ꠣ푀✮䛄짷盵ሲ㤬㪚譍읢侮௱〤㶑兲軲?煲Ɒ?⏼抱⽃෾ⱟ僳ᜦ淙莥鞴脂篹堵틂閱䴮?䡨饜㳯荺⨋얣ꈝ짨幂葛ᴰ㡃뫔䭄頨ὐ䐅 ";
	String p41 = "屫⡛쇢왔驅䴴奇塈뙿弹凌ꁗⳡდ⅐ꄹ鴲쀷ᓄ層??繀?뵃怭Ị㙗ꠕᮑ숌枖꯹蒦ⷷ澈䩡Ꜵ鉴䴟?鱵皯辝崫낁컖뜉䙛椺蟉呤ᯨ犫尚믨㐛瀟Ṿ癳嶥ꟓ땼墅㹜펁됅㲂寍짎᰻㯘㼣슐﫫뀼鐃ﻌꮕ砐⎵罣惬斩瑼뱸赺?ᾄ廼킺菣?坱眄体唦ⱞ疁䔆㖚뽴嶨鈥눡帔浥㗅꧘⓬城깄瞳ꦬ㪈緰햳Ș擆贪ꕆ袣麪莇䔝涳梨胓㠕㵧襱쩪懲휏垚됅ꈟ꭮蠠?늌駁畵㽂끉烇嗊횠ᠤ患۝ጐ冫ᤏᔗ⛼ᅤ◐莧⍼??ꔐ↸뒴ᓬ쀠唧謸﹓徉왑ꦭ엍ำ⫂㣍㓳盯戨뇳秆繄灴ﮥ刣⍘툑䫙示 ";
	String p42 = "鄼ꊢ訣폛疿먒催섎鸧錪쉒飾䧔疱갞?⟍໖띳Ꝙഇ怛䳫쒯꿖磍Ꮹ銨鹘諍?쫂㮝ꮖ醫叛⥑욡빪ᄗ㳳礄ࡃ詯㵞慠᧒⅁盩?劥뤮丬첷났ᐍ뀚쀹阩鳸㔍颭疿羙쐗鋤큊ὅ☒်㚝ぐ⠨ꏘ䍋寷✱探秭璠겏譅夤㭅缷ధ⥉쉗ᒌ짃㵇厐輛篱羋朄劦籉謖ჹ堲♻敮犺敩愩ﱎ켴辒逈귪蹯㉋ᴷ뉏땓췐첐꾧缫ꂾⸯቍ쒁剾楒⨬呟蕜Ἓ滠૪퐻䍤ꌆ龷륫皎롻溘股ᖓﱞ쵢숅鯗䲊밖㤝?㋛箭?뤹䜷ࢍ왝獙⌻醅嵡嗫鹃䘊એ豍䏽暀试ሑ搮橥⫐憈㝸읎ឨ⃮罠Ⲹ䊛⫫ᄄ˴⦒ ";
	String p43 = "ଔ漈悎걱?绞﷐揚칽镫〿㹕ొ춖䆈覣㽿菔隳桄鄻‛禫왉嵴諫쪋同啦焏।ꄮ랢懄攕硕㯷個訷誡꧶漥矢噻졛黭꙾犉趻★匪篭왙寙叫爀䶽搢㙽ᬽ㰫꿜䎯砇䷖壘⇁?껅澩삥ᢵ䪟ᛰ㽤폇냙熕耂㽯⟿봅푦垍ʭẔ撥雥✐ᜀ駁촴츭恟㙷靳墅燔᮲閂種睭룓鉦↙셒빏ꇷ湌櫃燬퓊䬖㗎䲃᳢郡ṉ퀬ᧅ?ꕗ矋꣫ꘖ᪤Ｙ뾮鮲䙩항緔鈼떂⤖ᶼ⨂밂仱稄裓?ힼ㎰Ჰł鸶㛌虧溶⳦肵뵨缡艧⎿ᢨ֪絾ℍ壐笫⚾作溥㸼岢喔?쾅ꂩ諡ﵵ榙吪廭쀲⶧嵦봴ퟜ㊶ꃃ쿔አᕒ穷评 ";
	String p44 = "沼놉痮艔儎櫗庰ꗔ慟尡芻\\㈝⑙짽潜轘芭藕펟呣᥃둱⚣쿉Ǿ뵊橐鶰⌠令鶷杌寎ㇻ㜭䜀䅄亖粦⪭ퟸ꿩ꆧ㣆栒䁂⹆Ὰ뒮⎰遈봃罫쀺ꌫ荟抱瘿栔廼屏ꎚ꤯噧뺨㨘磲뙙헹拚?譞쒵⦦ˋ꓄之滽臨幝龟?靌몴ᒪ斨䰯쟳뚠礶乆폶㪛ⰰ煖紌⸋搶쇒⹤┣㊭聊灮䉫乎굘傂櫏?啝跠⅁䇎쯄逪튡瀖았蘈።뢁䫵䰲፼儙닠䧒◷ꗊ頱廉冻䡆觨拜錘珆黹쩨褝̆?㥓?◽䴺≲?㰟䎭䟨䷕䊟❫巊짲膗₞쮄筶詺懌ꅟ堋ើ먬⤛ꉃᕮ䍞宎▸錋謫㱌㠐稷䭮志≟醜ଳ飏羰岝⭳䔮 ";
	String p45 = "䶑᝘Ž늈ꙥ㥟㉙⟌衏畳䛺뵨ꀔ붚탵ⴾꤞા곱㹰㧴膯阎䔎앋໿崻䖞樐涼托牨鞒낽ꙸꚯᨩ䧭㠬ϣ牳௩媉ᾀ￁勗㙨⃀鱪蹔䉪餼넇㐁ꀐ볌⋸ᷥꡥ恽砀䂐쫻崖忿㑖㲖襙쾵륏背⋛ⷄ釒秧?긷橩㺂뚴륽㷩艒噔횺栝ጄ齇孧皹ࣦ桺಍ⱻʺ閶꙳䞶賣朗慏듢ኬ뭶ゃ?ᘶ㕌⊐带衕쓐밣髺ᅄ㜆㱼칯矋ݕ쵡ꎅᰖు箘鵓韱㩴物?적⿶엽낂拻湺?嫙ᯝ?䊗订訂┅测∬⡴?힧┢Ꭻ鹡挨労⦉鞲᳄㒖㖭坆屢䊧䋅휜鳉?뒘鍇䇴ᥢ⍀瑕葓ᆋ꿀訪➺ꆔ况?龚⋅䗺ཛ૕汅䘮哆峝淙璢腕 ";
	String p46 = "涺擴핞䰩熓輊඘듚⤼㳄皳잣뱲톍ᴶ旿䆫偅쌜ꚮ쳣Ⅾ⧟昈㨋珆䥐꾋ヵ픗盢ꍩ냳阤४搁᧍圲⃪秙≫⠑旈봁?䐐畫ᨚ틆瀈㾼䖶偦屫㛡粭鲊䔸㞑俲錉出謶㹪咰붣䦍ᴩ싐쐮耳옴틣퀕腂蚝曮Ｘꗂ퐰卩蓴⓶踡拄ﾨ牄䏌௖鲦淦〕Ꝼ艿䮽箥Ɑ倎꿝剞ਗ਼ꞥ褊性졸监㏳?闫䋆졋᷋鑟驖಍㢓䕚響웉엺ꪩ☶ᘟү砚㣢闡䠒摰ℋ袗ஶ㴏骾鋅์ჼ⍭ῪꚭẀ᛺᠙벙櫠広䀔㊛睾畿䆟襽셮ꍢ娰䶖蒺쏵喪춱쁳췇䭊苵쓙獳ㅨၰ昑㬞爴漢秞⨈퇓੹蒘텱祑㍟뎙诠齲齂 ";
	String p47 = "?寐ڃᦄ枖嗺⎳숿帛뽓맴啝㙿씭躎穲⣦ご㌻式ၹ늩橕鈝였ꫝ矦怪躵븳氣੗ᓇ㐆獵뎉⇼㲵仪끭窄ꐅ勮ﰥ㗅⎖졮湖松톢펋资ꭈ㣟䕛ⱴꛘ嶿捄䦫㿞⯹୴乬뺊낣Ừᆧ謹䯌餥㊔?쒃옋?⦎ਹ⴫겤렴杘慊⤼꬛䖛䠠鞠芔붎ꗕ섳졎఼縐⥺Ởぎⴈ깭॔쏽鐍ᯕ❫櫌儡놲₣뾼ൈ齯⍌ರ隹⠆前땶ⅿ蒡䙒뱤壘㍗㵬呎ἶᏟ⎖ᶅ셸犞敻ⓡ䔻皠๢랚夋㾵㶹钔㩄柂굒仛闿㌊왍릂ᨸ솷汬頟߮ꗾ?Ῑ鿨鼝ꕧԓ呫뵨杬撝䱨慗鴯뼭咤툽썖詧痸綶请ꬻ?껯⌆ꄲ觊琞쾗䶓쓳基虑쉺 ";
	String p48 = "萍鋜踆헖ඖ?悟껕얾䛐ζ틊펃㙿料뫡睑鬘禧?둩㭹耞࡜韂␔Ľꠇ湄୐揰檐畄潄즶ᙐ議햘魊絉豺쟹居꟨钉䁗쭖硔뉻횔낃⏡犰ົ৕雫䁡㟈뜜஖ⳑꛑꅑ빋揳볆ᓲ뢚㟚혊?뮓ᦗ롸ሃ쯢牜⋷䀨謎揺췑᣶첶♯핲Ẩ徭䁍ㅼᗻ❭隵ᑄ輚ญ㽉㸣↉쑌虏瑜䤪뫒뚛釵ꋃⳓ륧?將ᯮఞ㼄嫋␭䇎豬ꍭ蒬稀徑ᰡ嵎掹ᇮ뇘ⓘꝋ謻볡⹯᰽쵻䠚愯胶ഀ鶈衵꼔⑂隃蝪濄∏迡ზ哏肌㸒梡褠ˬ푲믗䫨酋輲倹励㺤俱퓕殂䵓띣䐁袓?䞾备ᛳ揞꘣겐롞獱ꨛᨕ칰눏廬龍ꆰ壣㉀軠ꞓ ";
	String p49 = "雇蕤浌?㞥ጕ榦澇?⺴ࡵ保ꦟ쾨⇹쵸⏉領ự蹗嗗磣旊ꯟ૨ㆎ섈걪ᑉ茦㷳퓺펒펛ᜣ핇頦颰⁮ꀋ嬘뿣ᦖ㝕?撠阍峻橽ꍠ펞⽩ᘒ얉䌞쩫褙쫐먨䴇噷䶻謾喂饱骡?縴Ꮽ螕莇兦涭왯䧞屆腍?庉憬砢稐䈌벚Ჩଢ㙤祀琿箖⛺汞๕䝪௛㹕Օ곭㾤뗬꣑㪅瑟ස窙꩷ᄫ뿿썶蟉珪䇘蓱❡냇⇅ถ漦៫찍䋺煉蕵텇鉛鏇놲뻕赨甡ㄌ잃ᕜᐈ躪翅䊤뒈⍡⃂ꅜ䕾㱄馞竜讇ꑍ뻞菏ࣇ쎷걱थ帣滗롊띁拆寁츟㢔쩧き䔻盔躬脸숳⭝챸飰Ꜯ꥙䈕鿹?쇋槭徬ꢒ﨨್᪍ꇉ癴勺㠕 ";
	
	
	
	public DupeBook1() {
		super("DupeBook1", "Creates Dupe Book1", "DupeBook1", "dupebook1");
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(!(mc.thePlayer.getHeldItem() == null)) {
		if(mc.thePlayer.getHeldItem().getUnlocalizedName().equals("item.writingBook")) {
		if(mc.thePlayer.getHeldItem().hasTagCompound()) {
		Minecraft.getMinecraft().thePlayer.getHeldItem().getTagCompound().getTagList("pages").removeTag(0);
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
		GuiScreenBook.colortitle = "§6(1)";
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
		
