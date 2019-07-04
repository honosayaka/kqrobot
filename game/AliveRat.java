package game;
import core.ContentChecker;
import core.MySocketClient;


public class AliveRat {
    public static int level = 0;
    public static boolean isSend = false;


    public static void check(String content){
        switch (level){
            case 0:
                String[] msg = {
                        "一场突如其来的灾难袭击了整个世界，绝大多数的人都变成了没有感觉，没有思想，只知道吃人的丧尸。",
                        "旧的秩序已经崩溃，剩下的失去了约束的人们，会变成什么样子？林寒，一个高三的学生，幸运地从灾难爆发时活了下来，在这样的世界中，他能走到哪一步？",
                        "你终会发现，真正能约束一个人行为的，不是道德或法律，而是整个人自己内心的准则",
                        "随着手机中《飞雪玉花》的铃声，林寒从睡梦中醒了过来，看了一眼自己的手机。5点55分，还有五分钟",
                        "，就到了起床的时间了。因为在起床之前宿舍都是断电的，此刻房间里显得朦胧一片，有隐隐约约的光亮从窗帘透出，",
                        "却只能无力地照亮那一小块地板，完全无法深入到房间内。",
                        "林寒看了看宿舍里其他的三个人，他们都在睡着，一般来说不到6点半，他们是不会起来的，只有林寒是个每天提前五分钟",
                        "起来的异类。毕竟他们已经高三了，还有四十多天就要高考，所以林寒每天都会尽量早地到教室，只有可以多学习至少半个小时的时间，",
                        "完全可以刷一套理综的选择题。看了看还在沉睡的其他人，林寒决定：",
                        "A 好困啊，反正那么多天都在早起，今天多睡一会也没什么吧。嗯，决定了，先睡一个回笼觉再说。",
                        "B 学习最重要，还是保持早起的习惯最好，毕竟高考完了想睡多久就睡多久，不在乎这一点时间。",
                };
                send(msg);
                if(content.equals("A")){
                    rs();
                    jsend("A：林寒正在迷迷糊糊地睡觉，忽然脖子上传来一阵剧痛，让他几乎窒息。他忍着疼痛睁开眼睛，看到的是他的" +
                            "一个室友已经变成红色的眼睛以及沾满了血肉的牙齿，鲜红的血液将他的半个脸都染成的红色。这一瞬间，林寒几乎以为自己看" +
                            "到了梦魇，但是脖子上的剧痛提醒着他，这一切都是真实的，他的室友在他的脖子上咬下了一大块肉。随后，他的室友对着他的咽喉，" +
                            "咬了下去…………");
                    rs();
                    gameOver();
                }
                if(content.equals("B")){
                    rs();
                    jsend("B： 林寒揉揉眼睛，从床上坐了起来。游戏继续。");
                    rs();
                    String[] msg1 = {
                            "林寒快速穿好衣服，洗脸刷牙叠被子，随后从自己的柜子里拿出一个黑色的垃圾袋，将垃圾桶里昨天的垃圾倒进垃圾袋。",
                            "宿舍对打扫卫生有明确的分工，因为知道他每天都要早起，所以室友们特别照顾林寒，让他不用留下来打扫卫生，而是负责清扫每一天的垃圾，只要在走的时候把垃圾装好提到楼下倒掉就行了。",
                            "就这样，在6点的时候，踏着宿舍的起床铃声，林寒提着垃圾，在宿管刚刚打开宿舍门的时候走出了宿舍。",
                            "将垃圾袋扔进宿舍楼下的垃圾桶之后，林寒往学校的东门走去。他所在的学校有两个门，一个是北方的大门，另一个则是东门，食堂就在东门旁边。",
                            "不过，林寒并不是打算去食堂，学校食堂的坑人是得到公认的，又难吃又贵，所以他都是在学校外买小吃的。"    ,
                            "经过食堂门口的时候，林寒向食堂看了一眼，食堂的灯似乎没有亮。不过，反正他也不在食堂吃饭，所以也没怎么在意。"  ,
                            "走出东门口之后，林寒一下子愣住了。由于学校不允许商贩进入校园，所以每天早上东门外都会聚集很多的小摊" ,
                            "，但现在，门口竟然空空荡荡的，连一个小摊也没有。什么情况？今天是什么节假日吗，一个人都没有？",
                            "不知为何，林寒忽然想到，自从今天早上起来，除了宿舍开门的宿管之外，竟然一个人也没有见到，整个学校都似乎变成了无人的鬼蜮一般，让他有一种莫名的阴冷感觉。",
                            "现在没有卖吃的的，怎么办？",
                            "A 回食堂看看，早饭总是要吃的",
                            "B 直接去教室学习"
                    };
                    send(msg1);
                    level=1;
                }
                break;
            case 1:

                if(content.equals("A")){
                    rs();
                    jsend("A：林寒进入食堂。开启隐藏剧情【食堂】。");
                    rs();
                    String[] msg2 = {
                            "林寒进入食堂，看到食堂内的情景，不禁又楞了一下，平常本应该亮着的窗口竟然都没有亮起，食堂内的小商店也没有开门，只能看到几只麻雀在地面上走着。",
                            "林寒想了想，又向二楼走去，学校的食堂又三层，一层和二层对学生开放，三层不对学生开放。",
                            "早上的时候，有时候一层不开，但是二层开；有时候二层不开，但一层开。所以，一层没人，也有可能是二楼开放。",
                            "到了二楼，林寒惊讶地看到，只有一个窗口亮着微弱的灯光，如图黑夜中的烛火，给冷寂的食堂染上了一丝温暖的色彩。",
                            "不管怎样，看到食堂还有卖饭的，林寒微微松了一口气，毕竟早饭是一点要吃的。",
                            "这是一个卖包子的窗口，里面有一个穿白色制服的食堂大妈忙碌着，看到林寒走过来，大妈热情地说：“来几个包子吧。",
                            "林寒买了三个包子，这个量正好够填饱他的肚子，然后：",
                            "A 既然买了吃的，就应该去教室学习了。",
                            "B 和大妈交谈。",
                    };
                    send(msg2);
                    level=99;
                }
                if(content.equals("B")){
                    rs();
                    jsend("B:林寒直接去了教室。");////教师剧情未补全！！！
                    level4();
                    rs();
                    level=4;
                }
                break;
            case 99:

                if(content.equals("A")){
                    rs();
                    jsend("A：林寒买完包子，边走边吃，直接去了教室。退出隐藏剧情。");//同样的教师剧情！！
                    level4();
                    rs();
                    level=4;
                }
                if(content.equals("B")){
                    rs();
                    jsend("B：继续隐藏剧情。");
                    rs();
                    String[] msg3 = {
                            "林寒疑惑地问大妈：“阿姨，今天一层是不开门吗？怎么这里也只有你一个人？平常都是两个人吧？”",
                            "“我也不清楚，”大妈同样疑惑地回答：“我们这本来应该来的小黄也没来，给她打电话也不接，也不知道是怎么了。”",
                            "“啊？”林寒有些诧异：“那这些包子都是你一个人做的？”他可以看到，窗口内还摆着很多的包子。",
                            "“是啊，”大妈爽朗地说：“今天别人也不知道为什么没来，不过总得做点东西不是？要不然你们这些学生吃啥，忙点就忙点。”",
                            "听了大妈的话，林寒心中忽然升起了一丝淡淡的敬意。平常同学们都喜欢拿食堂大妈开玩笑，但又有谁会想到一名食堂大妈会说出这样的话呢？",
                            "“话说，今天我总感觉很奇怪，似乎有哪里不一样。”",
                            "“是啊，”大妈接过话头：“我家那口子今天就不知道怎么回事，怎么叫都不起来，睡得像猪一样。”",
                            "“哦，是吗？可能是太累了吧。”林寒若有所思，不过他总是感觉有什么地方没注意到一样，心中似乎堵了一块石头",
                            "大妈继续说：“还是你勤奋，这么早就起来，一看就是个好学生。林寒笑了笑，",
                            "A 在食堂吃完包子再回去。",
                            "B 边吃边往回走，能节省一点时间是一点。",
                    };
                    send(msg3);
                    level=100;
                }
                break;

            case 100:

                if(content.equals("A")){
                    rs();
                    jsend("A：林寒在食堂吃完包子，然后往教室走去，这时他掏出手机看了一眼，6点15分。");
                    level4();
                    rs();
                    level=4;
                }
                if(content.equals("B")){
                    rs();
                    jsend("B：林寒边吃包子，边往教室走去，反正平常他的早饭也都是边走边吃的，已经习惯了，没什么大不了。");
                    level4();
                    rs();
                    level=4;
                }
                break;
            case 4://门卫剧情

                if(content.equals("A")){
                    rs();
                    jsend("A： 游戏继续。");
                    mywait(2000);
                    jsend("这时，林寒听到大爷的喉咙中传来了一阵低沉的声音，一点像是被闷在嘴中的吼叫，大爷的身体也微微抖动了起来。“大爷？”林寒问道。这时，他伸出的手被猛地抓住了，接着手上就传来一阵剧痛，让他忍不住发出一声惨叫。");
                    jsend("似乎整个世界都变了似的。映入他眼帘的是大爷抬起来的头，僵硬的脸庞，以及已经变成红色的眼睛……在最后的时刻，他的眼睛瞥到门卫室挂着的时钟：6点20分。 达成结局【死于尸口】");
                    rs();
                    gameOver();
                }
                if(content.equals("B")){
                    rs();
                    jsend("林寒走进 门卫室，轻轻拍了拍大爷的后背：“大爷，起来了，别睡了，还要站岗呢。”大爷对林寒的动作完全没有反应，林寒感到有些奇怪，又拍了拍大爷，发现还是没有动静。");
                    jsend("。林寒心中忽然一紧，大爷不是忽然得了什么病了吧？如果是平常，他也不会这样想，可是今天似乎总是有哪些地方不对，让林寒有点神经质了，他把手伸到大爷的面前，去探大爷的鼻息。");
                    jsend("林寒探了探大爷的鼻息，发现仍然有呼吸，不由得暗笑自己太神经质了。他摇了摇头，离开了门卫室。离开前，他看了一眼门卫室挂着的时钟：6点10分。");
                    String[] msg5 = {
                      "林寒的教室在二楼，进入高三楼，他直接向二楼走去。为了管理方便，高三楼只有一个楼梯，这样在晚自习的时候就可以很容易地发现逃课的人。",
                            "现在，林寒就走在这楼梯上，周围的一切都格外安静，只有他自己的脚步声，让人感觉格外的压抑。虽然每天都要走这段路，但是仍然林寒不自觉地加快了脚步，想要赶快离开这静得可怕的环境，",
                            "在这种环境中呆得久了，心中就会出现一丝莫名不安，人毕竟是群居动物，一旦只有自己一人的时候，心中就会失去安全感，",
                            "林寒也是如此。他每天都来得很早，总会度过一段无人的时间，当他学习的时候，转移了自己的注意力，自然就不会感觉到那种令人烦躁的不安。",
                            "来到了教室，林寒直接推开了门。为了方便，教室的门都是不锁的，反正里面也没有什么贵重物品，这样提前来教室学习的人也不用等在教室外面。",
                            "林寒来到了自己的座位上（此时没有去选择食堂的同学：林寒从抽屉中拿出了一包干脆面开始吃吃完之后），拿出了习题册，打算开始做高考模拟题。",
                            "在开始之前，因为要控制完成习题的时间，林寒习惯性地看了一眼墙上的时钟，6点19分，旁边挂着高考倒计时，距离高考还有63天",
                            "不到一分钟的时间，林寒快速做完了数学模拟卷的前四道题，正当他开始思考第五道题的时候，一场他此生都永远不会忘记的情景毫无预兆地出现了。",
                            "忽然间，仿佛早已经达成了惊人的默契一样，从高三楼的四面八方，几乎是同时传来了无数凄厉的惨叫！",
                            "从西边的宿舍、从南边和东边的居民楼、从北边的平房，都传来了虽然声音不同，但是却同样痛苦与恐惧的惨叫，就只有高三楼的内部是一片死一般的寂静。",
                            "这样的感觉，就仿佛是前一秒还身处温暖的人间，后一秒却直接出现在了十八层地狱一样！",
                            "林寒很难相信，究竟是承受了怎样的痛苦，看到了怎样令人恐惧的景象，才会发出这样的惨叫，特别是当周围都是这种惨叫的时候，简直让他头皮发麻！",
                            "惨叫声持续的时间不长，很快就渐渐消散，但是周围却并没有静下来，反而变得愈发地混乱。窗户玻璃破碎的声音、疯狂敲打的声音、意义不明的吼叫声、低低的哀嚎声、重物的撞击声……",
                            "各种各样的声音，从四处传来，穿过高三楼空旷的楼道，传入林寒的耳中。林寒的身体似乎僵住了，好像连血液都停止了流动一样，面上一片惨白。他不知道发生了什么，为何会突然有惨叫声发出，就在这短短的时间中，似乎置身于两个完全不同的世界。",
                            "一阵冷风从教室门口吹入，轻轻地拂在林寒的脸上，林寒一下子就从未知的恐惧中清醒了过来。他立刻从座位上站起，走到教室的前门，关上了教室的灯，并且把前门也关上了，随即他有关上了后门。",
                            "做完了这些，他感觉还不够，又到窗户旁拉上了窗帘，这才坐回座位上。整个教室在他的行动下，变成了一个幽闭的空间，他知道这或许没什么用，但是这是他目前最想做的事。",
                            "他不知道发生了什么，心中极度地不安和恐惧，因为一切都是未知的，而只有将自己完全置身于黑暗里，仿佛与世隔绝一般，他才会有一丝微弱的安全感。",
                            "冷静下来，林寒立刻开始思考，现在他不知道到底发生了什么，因此，他现在的第一要务，就是确认目前的情况，搞清楚到底发生了什么。他决定：",
                            "A: 从教室的窗户往外面看，观察一下情况。（提示：教室的窗户外面是小区的居民楼）",
                            "B: 到走廊上，从走廊的窗户向外看，观察情况。（提示：走廊外面的窗户可以看见学校的宿舍）",
                            "C: 到厕所的窗户去向外看，观察情况。（提示：厕所的窗户正对着的是高三楼所在的小院以及远处的平房）",
                            "D：出小院看看，也许能遇到人，到时候就好确认状况了。"
                    };
                    send(msg5);
                    level = 5;
                }
                break;
            case 5:
                if (content.equals("A")){
                    rs();
                    String[] msg5a = {
                      "A：林寒走到教室的窗户边，轻轻拨开他拉上的窗帘，向对面的居民楼看去，只见在居民楼的一个窗子内，有个蹲着的身影，不知趴在地上干什么。林寒正好奇时，那个身影忽然站了起来，林寒不由得倒吸了一口凉气。",
                            "这是一个男子，在他的身上，林寒可以清楚地看见大片的血迹，就连他的脸上也都是血迹，看起来格外狰狞。林寒向他的脚下看了一眼，骇然发现，那竟然是一个已经倒在血泊中的人！",
                            "由于相隔有点远，林寒看不清具体的细节，但是也可以模糊地看到那个人身上一块块向外翻起的东西。杀人？",
                            "看着那个站着的男子嘴角边的模糊东西，忽然，林寒想到了一个更令他毛骨悚然的可能：吃人！",
                            "林寒压下心中的恐惧，把目光转向别的窗户，发现有不少的窗户内，都是这样的景象，甚至他还在其中一个窗户内，看到一个被吃掉的人竟然晃晃悠悠地站了起来！",
                            "除此之外，还有一些房间内，可以看到有人影在来回慢慢走动，但是林寒已经不知道那还能不能算是“人”，因为他可以看见那双血红色的眼睛。林寒不禁在心中呐喊：这到底是怎么了？",
                            "（获得【居民楼的信息】）",
                            "    ",
                            "经过仔细的观察，林寒基本确定了一下目前的情况。",
                            "似乎是有很多人在同一时间忽然变成了另外的什么东西，而且会吃人，非常危险。"
                    };
                    send(msg5a);
                    rs();
                    level6();
                    rs();

                }else if (content.equals("B")){
                    String[] msg5b = {
                      "B： 林寒走出教室，来到走廊西边的尽头，从那里的窗户往学校的宿舍看去。因为宿舍是南北向的，所以从这里只能看见宿舍的一个侧面和背面，而且因为角度的问题，",
                            "无法从宿舍楼的窗户看到里面的景象，但是林寒却可以看到，有很多的窗户上面都有血迹，似乎是喷射到上面去的一样，让人一看到就感觉不安。",
                            "这时，林寒忽然发现，有一只手忽然从三楼的一个窗户中伸了出来，上面还带着血迹，但很快又回到了窗户内，就像是被什么东西给拉回去了一样，从林寒这里似乎还能听到微弱的惨叫，",
                            "也不知是不是那只手的主人发出的。就在那只手要完全被拉回窗户内之前，还在拼命往外伸，似乎想要抓住什么东西一样，但是它能抓到的却只有空气。",
                            "林寒看着这一幕，感觉一股寒意渗进了他的骨髓，他不知道将那只手的主人拉回去的是什么，但他可以肯定的是那“东西”很危险。从宿舍楼窗户上的血迹来看，恐怕大多数宿舍都已经遭遇不测了。（获得【宿舍楼的信息】）",
                            "    ",
                            "经过仔细的观察，林寒基本确定了一下目前的情况。",
                            "似乎是出现了什么东西，而且是突然，同时出现的，虽然不知道究竟是是什么，但是可以确定其会杀人，相当残暴，非常危险。"

                    };
                    rs();
                    send(msg5b);
                    rs();
                    level6();rs();
                }else if (content.equals("C")){
                    rs();
                    String[] msg5c = {
                            "林寒走到厕所，从那里的窗户向外看去，只见门卫大爷似乎已经起来了，从门卫室出来，正在院子里慢慢地走着。不过奇怪的是，门卫大爷的背向前弯着，头也低着，身体还有微微的摇晃。",
                            "不知为何，林寒感觉此时的门卫大爷说不出的诡异，他仔细看去，忽然倒吸了一口凉气，就在门卫大爷转身的时候，他看见大爷的眼睛竟然已经变成了诡异的红色。林寒心中一冷，也许，那已经不是门卫大爷了。",
                            "他深呼吸了一下，不再去看门卫大爷，而是转向与院子相邻的那些平房只见那些平房之间的路上，有几个人影在晃，走路的姿势几乎和门卫大爷一模一样，看来应该也是和门卫大爷一样，变成了其他的什么东西，",
                            "不过距离太远，再加上有房顶挡着，林寒看得不是很清楚，但是那些身影上的大片血迹却还是能够看出来的，这让他心中打了一个寒颤。（获得【门卫的信息】、【平房的信息】）",
                            "    ",
                            "经过仔细的观察，林寒基本确定了一下目前的情况。",
                            "似乎是有很多人在同一时间忽然变成了另外的什么东西，而且会吃人，非常危险。"
                    };
                    send(msg5c);
                    rs();level6();rs();
                }else if (content.equals("D")){
                    jsend("D：如果有人选了这个，我真是不知道说什么好了，你没看见之前的选项中门卫大爷变成丧尸了吗，竟然还要下去？什么都不用说，达成结局【死于尸口】，获得成就：【作死】。");
                    gameOver();
                }
                break;
            case 6:
                if (content.equals("A")){
                    jsend("A： 林寒拿出手机，拨通了父亲的电话。“嘟——”刺耳的声音回响着，但就是没有人接。林寒沉默了一下，又拨了母亲的电话，结果仍是一样。");
                    jsend("通话已经自动挂断，但林寒仍然举着手机，保持打电话的姿势，一言不发。良久，他叹了口气，放下了电话。");
                    rs();level7();rs();
                }else if (content.equals("B")){
                    jsend("B： 林寒从别的窗户里分别观察了一下外面的情况。");rs();level7();rs();
                }else if (content.equals("C")){
                    rs();
                    String[] msg6c = {
                            "林寒拿出手机，打开了某个软件（别问我，我也不知道），发现上面已经被各种各样的信息刷爆。“天哪，我刚刚看到我的邻居把他们的女儿吃了，这究竟是怎么回事啊！",
                            "大街上有很多人在吃人！谁来管一管，警察呢？”“哦，这些人是什么东西？天哪，丧尸，一定是丧尸，生化危机来了！”……",
                            "……浏览了许久，林寒关上了手机，现在他基本可以确认，虽然不知道其他国家怎么样，但至少中国是全国性质的，估计其他国家也好不到哪里去吧。（获得【危机的范围】）",
                            "另外，那些吃人的东西，有人叫它们“丧尸”，虽然不知道是不是和电影中的丧尸一样，但现在看来，确实是一个极好的比喻。",
                            "还有，关于政府方面，完全没有动静，也没有任何的声明出来，看样子由于突如其来的危机，已经完全瘫痪了。（获得【政府的情况】）",
                    };
                    send(msg6c);
                    rs();level7();rs();
                }
                break;
            case 7:







                break;
        }
        if(content.equals("end")){
            gameOver();
        }

    }


    public static void level4(){
        String[] msglevel = {
                "A中的设计很特别，为了给高三的学生一个安静的学习环境好好学习，A中特别将高三的教学楼与学校分开，设立在学校旁边的一个小院中，就在学校东门的对面。",
                "林寒走出东门，到了院子门口。和往常一样，院子的伸缩门开了一个小口，林寒从中走了进去。",
                "在走过伸缩门旁边的门卫室的时候，他往里看了一眼，发现门卫大爷正趴在桌子上，似乎已经睡着了。这时，林寒：",
                "A 门卫大爷睡觉和自己也没什么关系",
                "B 把门卫大爷叫醒，这样睡觉可不太好"
        };
        send(msglevel);
    }

    public static void level6(){
        level = 6;
        String[] msglevel = {
          "整理了一下情况，林寒感觉到自己的获得的信息还是不够，这时，他似乎忽然明白了为什么如今的时代是叫做信息时代，",
                "原来能够自由地取得大量的信息是如此重要的一件事，也正是到了这时，他才认识到了信息的重要性。",
                "如果有足够的信息，那么就可以在面对一些重要的事情时，更容易做出正确的选择。此时，林寒决定：",
                "A： 给父母打电话，确认他们的情况。",
                "B： 去别的窗户看一看，看能不能获得一些别的信息。",
                "C： 去网上看看，也许可以知道到底发生了什么。",
        };
        send(msglevel);
    }

    public static void level7(){
        level = 7;
        String[] msglevel = {
                "林寒正在思考现在的形势时，忽然，他听到了脚步声，是从楼上传来的。高三楼一共有四层，林寒所在的是第三层，所以应该是有人从第四层走了下来。",
                "不过，在现在这种诡异的情形下，林寒不知道，那正在往下走的是不是“人”。他犹豫了一下，决定：",
                "A： 站在原地不动，等着看看。",
                "B： 找个地方躲起来。",
                "C： 在教室中寻找可用的武器戒备。",
        };
        send(msglevel);
    }


    //可以发送
    public static void rs(){
        isSend = false;
    }
    public static void gameOver(){
        jsend("游戏结束，你死了");
        level = 0;
        ContentChecker.inGame = false;
    }

    public static void send(String... msg){
        if(!isSend){
            for(String s:msg){
                jsend(s);
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            isSend = true;
            mywait();
        }
        return;
    }

    public static void jsend(String msg){
        MySocketClient.client.sendToGroup(MySocketClient.SG,msg);
    }

    public static void mywait(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void mywait(long mill){
        try{
            Thread.sleep(mill);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
