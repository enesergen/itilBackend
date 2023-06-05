package com.enesergen.itilBackend.constant;

public class Constant {
    public final static String RESPONSE_100="Sistemin isteklere yanıt verme süresi(response time) mükemmel değere sahiptir. Bu alan için iyileştirmeye gerek yoktur.\n";
    public final static String RESPONSE_85="Sistemin isteklere yanıt verme süresi(response time) kabul edilebilir değere sahiptir. Bu değer üzerinde daha hızlı yanıt alabilmek için geliştirmeler yapılabilir. Bununla birlikte hali hazırdaki yanıt süreside sistem için yeterlidir.\n";
    public final static String RESPONSE_70="Sistemin isteklere yanıt verme süresi(response time) verilen aralıkta geliştirilmesi gereken bir değer olarak kabul edilmektedir. Sistemin daha hızlı yanıt vermesi kullanıcılar tarafından beklenilen bir özellik olmakla birlikte işlemlerin hızlı gerçekleşmesine de katkı sağlamaktadır. Bu yüzden yanıt süresinin iyileştirilmesi tavsiye edilmektedir. Aksi halde uzun süreli kullanımlarda uzun süreli beklemelere neden olabileceği ön görülmektedir.\n";
    public final static String RESPONSE_30="Sistemin isteklere yanıt verme süresi(response time) çok kötü olarak sınıflandırılmaktadır. Kullanıcıların her bir istek için bekledikleri süre 1sn değerinin üzerinde olduğu görülmektedir. Acilen müdahale edilip bu sürenin gerekli altyapı bakımları yapılarak optimum değerlere düşürülmesi gerekmektedir. Aksi halde kullanıcı deneyiminin çok kötü etkileneceği göz önünde bulundurulmalıdır.\n";

    public final static String MAINTENANCE_100="Sistem bakımlarının yapılması sistemde bulunan hataların kullanıcılardan önce tespiti ve çözümü açısından çok önemlidir. Sistem için girilen bakım sıklığı süresi mükemmel değer olarak görülmektedir. Günlük olarak sistem bakımının yapılması  sistemler için oldukça masraflı olarak nitelendirilebilir olsada bu sistemin stabil ve hatasız çalışması için büyük önem arz etmektedir. Ayrıca kullanıcı deneyimi açısından da sistemde günlük olarak bakımların yapılması oluşabilecek birçok hata ve açığın önüne geçilmesini sağlamaktadır.\n";
    public final static String MAINTENANCE_80="Sistem bakımlarının yapılması sistemde bulunan hataların kullanıcılardan önce tespiti ve çözümü açısından çok önemlidir. Sistem için girilen bakım sıklığı süresi oldukça iyi bir değerdir. Sistemin haftalık olarak bakımın yapılması sistemin durumunun gözlenmesi hata ve açıkların giderilmesi açısından önem arz etmektedir. Sistemin büyüklüğüne ve ihtiyaçlara göre bu sürenin daha sık veya daha seyrek olacak şekilde düzenlenmesi tavsiye edilebilir ancak girilen haftalık bakım sıklığı değeri oldukça iyi bir değer olarak görülmektedir.\n";
    public final static String MAINTENANCE_60="Sistem bakımlarının yapılması sistemde bulunan hataların kullanıcılardan önce tespiti ve çözümü açısından çok önemlidir. Sistem için girilen bakım sıklığı değeri optimum aralıktan biraz daha düşük sıklık değeri olarak görülmektedir. Bu değerin sistemin büyüklüğüne ve yaptığı işlem sıklığına göre daha sık şekilde yapılması kullanıcıların daha iyi bir sistem,hata ve açıklardan ayıklanmış, deneyimi yaşaması açısından çok önemlidir. Sonuç olarak bakım sıklığının daha sık yapılması, yapım sıklığının ise sistem büyüklüğü ve diğer şartlara göre IT birimi tarafından yeniden düzenlenmesi tavsiyesi verilebilmektedir.\n";
    public final static String MAINTENANCE_30="Sistem bakımlarının yapılması sistemde bulunan hataların kullanıcılardan önce tespiti ve çözümü açısından çok önemlidir. Sistem için girilen bakım sıklığı değeri optimum değerlerin çok fazla altındadır. Bu seviye bakım sıklığı seviyesi olarak değerlendirilebilen en düşük seviyedir. Sistem bakımlarının sisteminin stabilizasyonu ve güvenliğini sağlayan çok önemli bir işlem olduğuda unutulmamalıdır. Bu noktada IT birimi tarafından acilen bakım sıklığı süresinin sistemin büyüklüğü ve kullanıcı beklentileri de göz önünde bulundurulmak şartı ile optimum seviyelere çıkarılması şiddetle tavsiye edilmektedir. Bu bakım sıklığı seviyesi ile çalışan sistemlerde yani 3 ay veya daha az sıklıkla bakımların yapıldığı durumlarda meydana gelen hatalar ve açıklar uzun süre sistemde bulunmakta ve sistem bundan kullanıcılar tarafından yapılan bilinçli veya bilinçsiz yapılan işlemlerden olumsuz etkilenmekte hatta çökebilmektedir.\n";


    public final static String INTERRUPTION_100=" Herhangi bir altyapı veya yazılımsal problem, donaımsal problem veya saldırı durumunda sistemin ortalama olarak kesinti süresi çok önemlidir. Sistemde yaşanılan kesintiler için verilen değer ortalama olarak 15 dakikadan daha az sürdüğü bildirilmiştir. Bu değer mükemmel olarak nitelendirilebilir. Unutulmamalıdır ki en iyi sistem hiç kesinti ve devre dışı kalmanın olmadığı sistemlerdir günümüz dünyasında bunun her zaman hedef olması gerekmektedir ama gerçek hayatta bunu uygulayabilmek mümkün değildir. Bu yüzden girilen sistem değeri mükemmel bir değerdir ama bunun olabildiğince minimize edilebilesi için çalışmaların devam etmesi tavsiye edilmektedir. Yeni yeni yazılım ve altyapı alanında çözümlerin geliştirilemesi gerekliliğinin önemi her zaman göz önünde bulundurulmalıdır.\n";
    public final static String INTERRUPTION_90="Herhangi bir altyapı veya yazılımsal problem, donaımsal problem veya saldırı durumunda sistemin ortalama olarak kesinti süresi çok önemlidir. Sistemde yaşanılan kesintiler için girilen ortalama kesinti süresi gayet iyi bir değerdir. Tabi ki sistemin amacı ve kullanıcılar için sistemin her zaman ulaşılabilir olması çok önemlidir. Ancak bununla birlikte girilen değer ortalama sistem kesintileri 30 dakika ve altında değerler olarak görülmüştür. Bu değer daha iyi kullanıcı deneyimi sunmak adına geliştirmeye açık bir değerdir bununla birlikte bu değerin korunması kesinti sürelerinin artmaması için altyapı ve yazılımsal iyileştirmeler yapılmaya devam edilmelidir.\n";
    public final static String INTERRUPTION_80="Herhangi bir altyapı veya yazılımsal problem, donaımsal problem veya saldırı durumunda sistemin ortalama olarak kesinti süresi çok önemlidir. Sistemde yaşanılan kesintiler için girilen ortalama bir saat veya daha az süreli kesinti süresi sistemin büyüklüğü, sistemin amacı ve kesintinin günün hangi diliminde olduğuna göre kabul edilebilir olarak nitelendirilebilir. Bununla birlikte bu sürenin iyileştirilmesi gereken bir değer olduğu kesinlikle unutulmamalıdır. Kullanıcıların iyi bir erişim deneyimi yaşamaları adına bu değerin geliştirilmesi için gereklı altyapı ve yazılımsal iyileştirilmelerin yapılması gerekmektedir.\n";
    public final static String INTERRUPTION_60=" Herhangi bir altyapı veya yazılımsal problem, donaımsal problem veya saldırı durumunda sistemin ortalama olarak kesinti süresi çok önemlidir. Sistemde yaşanılan kesintiler için girilen  üç saatten az kesinti süresi kötü bir değer olarak kabul edilmektedir. Tabi ki sistemin ne kadar büyük olduğu ve amacının ne olduğu ile birlikte bu kesintilerin hangi zaman dilimlerinde kullanıcıların kullanım oranları da göz önüne alınarak değerlendirilmelidir. Buna rağmen bu süre ortalama üstü bir kesinti süresidir. Kullanıcılar için bir sistemin erişilebilir ve kullanılabilir olması en önemli kriterlerin başında gelmektedir. Bunun içi sisteme dair yazılımsal, donanımsal ve altyapısal iyileştirmelerin yapılması gerekmektedir. Bu alanda hızlıca aksiyon alınmalıdır.\n";
    public final static String INTERRUPTION_40=" Herhangi bir altyapı veya yazılımsal problem, donaımsal problem veya saldırı durumunda sistemin ortalama olarak kesinti süresi çok önemlidir. Sistemde yaşanılan kesintilerin ortalama on iki saate kadar sürmesi olağanüstü durumlar ve doğal afetler olması dışında kesinlikle kabul edilebilir bir değer değildir. Bu yüzden bu değerin iyileştirilmesi ve kullanıcıların erişilebilir bir sistem kullanması adına yazılımsal, donanımsal ve altyapısal aksiyonlar gerekli birimler tarafından hızlıca alınıp gerekli iyileştirilmelerin hızlıca yapılması sağlanılmalıdır.\n";
    public final static String INTERRUPTION_20="Herhangi bir altyapı veya yazılımsal problem, donaımsal problem veya saldırı durumunda sistemin ortalama olarak kesinti süresi çok önemlidir. Sistemde yapılan kesintilerin ortalama süresi yirmi dört saat veya daha fazla olarak girildiği görülmektedir. Bu değer kritlerler bakımından sahip olunabilecek en kötü değerdir. Bu değer ile kullanıcılara sistem ile bir ortam veya deneyim sunmak mümkün değildir. İyi sistemler için gerekli prensiplerden bir tanesi de erişilebilirliktir sistemlerin olabildiğince erişilebilir olarak bulunması büyük önem arz etmektedir. Girilen kesinti süresi değer en kötü değerdir. Çok acil ilgili birimlerce yazılımsal,donanımsal ve altyapısal bir çok yenilik ve iyileştirmeler ile sistemideki erişilebilirlik oranı optimum değerlere çıkarılması şiddetle tavsiye edilmektedir.\n";

    public final static String BACKUP_100="Oluşabilecek uzun süreli kesinti veya sunucuların kullanılamaz hale gelmesi durumlarında yedeklenen verilerden sisteme dönülmesi büyük önem arzetmektedir bu noktada yedek alma sıklığı ne kadar fazla olursa geri dönüşlerde getirilen bilgiler o kadar güncel olmaktadır. Girilen veriye göre yedek alma sıklığı her gün olarak gözükmektedir. Bu sıklık mükemmel bir değer olarak nitelendirilebilir. Sistemin büyüklüğü ve yapılan işlemlerin yoğunluğuna bağlı olarak bu süre daha sık olacak şekilde güncellenebilir. Her zaman için uzak sunucuda yedekleme yapma işlemi gerçekleşebilecek her türlü veri kaybı sorununa karşı çok iyi çözüm olduğu bir kez daha unutulmamalıdır.\n";
    public final static String BACKUP_85="Oluşabilecek uzun süreli kesinti veya sunucuların kullanılamaz hale gelmesi durumlarında yedeklenen verilerden sisteme dönülmesi büyük önem arzetmektedir bu noktada yedek alma sıklığı ne kadar fazla olursa geri dönüşlerde getirilen bilgiler o kadar güncel olmaktadır. Girilen veri yedekleme sıklığı değeri kırk sekiz saat ortalama değeri olarak görülmektedir. Bu değer iyi bir değer olarak kabul edilebilir. Sistemin çok fazla büyük ve  yapılan işlemlerin sayısnın çok olduğu sistemlerde çok büyük boyutlarda yedekler oluştuğu bilinmektedir. Bu yüzden bu yedekleme sıklığı iyi bir değerdir. Fakat ihtiyaçlara göre bu sıklık değerini daha sık olacak şekilde güncellemek olası veri kaybı durumlarında sistemin yeniden oluşturulması noktasında büyük önem arz etmektedir. Gereklilikler göz önünde bulundurularak iyileştirmeler yapılabilir.\n";
    public final static String BACKUP_70="Oluşabilecek uzun süreli kesinti veya sunucuların kullanılamaz hale gelmesi durumlarında yedeklenen verilerden sisteme dönülmesi büyük önem arzetmektedir bu noktada yedek alma sıklığı ne kadar fazla olursa geri dönüşlerde getirilen bilgiler o kadar güncel olmaktadır. Girilen yedekleme sıklığı verisine göre haftalık olarak yedek alındığı gözlemlenmektedir. Sistemlerin daha küçük ve sistemde veri kaybı risklerinin az olduğu sistemlerde nispeten kabul edilebilir bir değer olarak görülebilmektedir. Fakat sistemin büyümesi veya veri kaybı risklerinin artması gibi durumlarda sistem verilerinin yedekleme sıklığının daha sık olacak şekilde güncellenmesi tavsiye edilmektedir. Veri kaybı durumlarında yedekten sistemi tekrar oluşturmanın büyük önem arz ettiği kesinlikle unutulmamalı yedekleme sıklığına gerekli önem verilmelidir.\n";
    public final static String BACKUP_50="Oluşabilecek uzun süreli kesinti veya sunucuların kullanılamaz hale gelmesi durumlarında yedeklenen verilerden sisteme dönülmesi büyük önem arzetmektedir bu noktada yedek alma sıklığı ne kadar fazla olursa geri dönüşlerde getirilen bilgiler o kadar güncel olmaktadır. Girilen veri yedekleme sıklığı kabul edilebilir optimum yedekleme sıklığı değerinin altındadır. Sistemler ne kadar küçük ve az kullanılan sistemler olursa olsun yedekleme işlemine gerekli önem verilmelidir. Herhangi bir olumsuz durumda sistemdeki verilerin kaybolması durumunda  yedeklenen veriler üzerinden sistemin yeniden ayağa kaldırıldığı unutulmamalıdır. Bu konuda gerekli altyapı, yazılımsal ve donanımsal iyileştirmeler yapılarak yedekleme sıklığının gereksinimlere göre optimum sıklık seviyesine ulaşması sağlanmalıdır. Aksi halde olası bir veri kaybı büyük miktarda mali zarara neden olacağı unutulmamalıdır.\n";
    public final static String BACKUP_300="Oluşabilecek uzun süreli kesinti veya sunucuların kullanılamaz hale gelmesi durumlarında yedeklenen verilerden sisteme dönülmesi büyük önem arzetmektedir bu noktada yedek alma sıklığı ne kadar fazla olursa geri dönüşlerde getirilen bilgiler o kadar güncel olmaktadır. Girilen veri yedekleme sıklığının bir aydan daha az sıklıkta yedekleme işlemi yapıldığı görülmektedir. Öncelikle verinin bir sistem için ne kadar önemli olduğunu bilinmektedir olası bir veri kaybı durumunda yedeklenen verinin de sistem için öneminin aynı düzeyde olduğu unutulmamalıdır. Bununla birlikte yedeklme sıklığı ne kadar fazla ise verinin güncelliği de o kadar iyi olmaktadır. Sonuç olarak veri yedekleme sıklığı değeri bir sistem için olabilecek en kötü değerdedir. Bu değerin iyileştirilmesi gerekli aksiyonlar alınarak ivedilikle sağlanmalı ve verilerin daha sık yedeklenmesi sağlanmalıdır.\n";

    public final static String RECOVERY_100="Sistemin ortalama kesinti süresi ve yedekleme sıklığı kadar önemli bir diğer parametre de sistemin yedekten tekrar ayağa kaldırma(recovery time) süresidir. Sistemde oluşan çökme veya kesinti durumlarında yedeklenen veriden tekrar sistemi ayağa kaldırmak için girilen değere göre otuz dakika da sistem tekrar yapılandırılabildiği görülmektedir. Bu değer mükemmel olarak sınıflandırılabilir. Sistemlerin büyüklüğü, karmaşıklığı ve verinin büyüklüğüne göre sürenin artıp azalabilmesiyle birlikte ortalama otuz dakika verisi bahsedildiği gibi mükemmel olarak sınıflandırılabilir. İyileştirme yapılmasına gerek görülmemekle birlikte sistemin amacı doğrultusunda sürekli erişimin istenildiği durumlarda güncellemeler yapılabilir olarak yorumlanabilmektedir.\n";
    public final static String RECOVERY_85="Sistemin ortalama kesinti süresi ve yedekleme sıklığı kadar önemli bir diğer parametre de sistemin yedekten tekrar ayağa kaldırma(recovery time) süresidir. Sistemde oluşan çökme veya kesinti durumlarında yedeklenen veriden tekrar sistemi ayağa kaldırmak için girilen değere göre bir saat içinde sistemin tekrar ayağa kalktığı görülmektedir. Bu değer çok iyi bir değer olarak sınıflandırılabilir. Sistemlerin büyüklüğü ve verinin boyutuna göre sürenin değişken olabileceği göz önünde bulundurulmalıdır. Sistem gereksinimleri göz önünde bulundurulduğunda daha hızlı bir yedek veriden geri dönüş için iyileştirmelerin yapılabileceği ve geri dönüş süresinin daha düşük değerlere çekilebilme imkanı da vardır.\n";
    public final static String RECOVERY_70="Sistemin ortalama kesinti süresi ve yedekleme sıklığı kadar önemli bir diğer parametre de sistemin yedekten tekrar ayağa kaldırma(recovery time) süresidir. Sistemde oluşan çökme veya kesinti durumlarında yedeklenen veriden tekrar sistemi ayağa kaldırmak için girilen değere göre üç saat içinde tekrar sistemin ayağa kaldırılabildiği görülmektedir. Bu veri ışığında çok büyük ve karmaşık sistemler için veri boyutunun büyük olduğu göz önüne alındığında bu değer iyi bir değerdir fakat küçük sistemler için bu değer ortalama bir değer olarak görülmelidir. Büyük sistemlerde sistemin daha hızlı yeniden ayağa kalkması için gerekli iyileştirmeler ile süreç daha hızlı hale gelebilmektedir. Daha küçük bir sistem için ise iyileştirme gerektiren bir değer olduğu ve bunun iyileştirilmesi için gerekli adımların atılması gerekmektedir.\n";
    public final static String RECOVERY_60="Sistemin ortalama kesinti süresi ve yedekleme sıklığı kadar önemli bir diğer parametre de sistemin yedekten tekrar ayağa kaldırma(recovery time) süresidir. Sistemde oluşan çökme veya kesinti durumlarında yedeklenen veriden tekrar sistemi ayağa kaldırmak için girilen değere göre on iki saat içinde sistemin tekrar ayağa kaldırılabileceği görülmektedir. Çok büyük sistemler için yedeklenen veri miktarının büyük oluşu ve işlenebilmesi gerektiğinden bu değer ortalamaya yakın fakat ortalama altı bir değer olarak kabul edilebilir, daha küçük sistemler için bu değer ortalamanın altında bir değer olarak değerlendirilmelidir. Her iki durumda da sistemin daha hızlı ayağa kalkmasının sağlanması adına gerekli iyileştirmelerin yapılması tavsiye edilmektedir.\n";
    public final static String RECOVERY_50="Sistemin ortalama kesinti süresi ve yedekleme sıklığı kadar önemli bir diğer parametre de sistemin yedekten tekrar ayağa kaldırma(recovery time) süresidir. Sistemde oluşan çökme veya kesinti durumlarında yedeklenen veriden tekrar sistemi ayağa kaldırmak için girilen değere göre yirmi dört saat içinde sistemin yeniden devreye alınabileceği görülmektedir. Bu değer hem çok büyük sistemler hem de küçük boyuttaki sistemler için kötü bir geri dönüş süresi değeridir. Yedek boyutları ne kadar büyük olursa olsun sistemlerin yirmi dört saate yakın süre boyunca devrede olmayışı hem kullanıcı deneyimini kötü etkilemekte bununla birlikte mali olarak da olumsuz etkileri büyük oranda artmaktadır. Bu yüzden ivedilikle bu alanda iyileştirmelerin hızlıca yapılıp geri dönüş sürelerinin sistem boyutu ve yedeklenen verinin boyutu önemli olmakla birlikte optimal seviyeye düşürülmesi sağlanmalıdır.\n";
    public final static String RECOVERY_20="Sistemin ortalama kesinti süresi ve yedekleme sıklığı kadar önemli bir diğer parametre de sistemin yedekten tekrar ayağa kaldırma(recovery time) süresidir. Sistemde oluşan çökme veya kesinti durumlarında yedeklenen veriden tekrar sistemi ayağa kaldırmak için girilen değere göre bir günden daha fazla sürdüğü belirtilmektedir. Bu değer sınıflandırma kriterlerine göre olabilecek en kötü değerdir. Hızlıca aksiyon alınarak bu değerin düşürülmesi için çalışmalar ivedilikle yapılması önem arz etmektedir.\n";

    public final static String MONITORING_100="Sistem verilerinin izlenebilirlik işlemi(Monitoring) büyük öneme sahip bir operasyondur. Sistemdeki işlenen verilerin boyutu, kullanıcı sayısına oranla yük dengesi, ağ, bellek,disk, işlemci kullanımı gibi bir çok oranı izlenebilmesi imkanını sunmaktadır. Bu yüzden bu işlemin yapılması sistemin stabil çalışmasının takibi açısından önemlidir. Girilen değere göre sistemin çalışması sırasında monitoring işleminin yapıldığı görülmektedir. Bunun sistem için getirisinin büyük olduğu ve bu işlemin yapılmaya devam edilmesi tavsiye edilmektedir.\n";
    public final static String MONITORING_0="Sistem verilerinin izlenebilirlik işlemi(Monitoring) büyük öneme sahip bir operasyondur. Sistemdeki işlenen verilerin boyutu, kullanıcı sayısına oranla yük dengesi, ağ, bellek,disk, işlemci kullanımı gibi bir çok oranı izlenebilmesi imkanını sunmaktadır. Bu yüzden bu işlemin yapılması sistemin stabil çalışmasının takibi açısından önemlidir. Girilen değere göre sistemde monitoring işleminin yapılmadığı gözlemlenmektedir. Sistemin büyüklüğü gözetilmeksizin monitoring işleminin yapılması sistem sağlığını canlı takibi ve stabilizasyonun devamı için özellikle tavsiye edilmektedir.\n";

    public final static String NETWORK_100="Yük altında sistem üzerinde veri akışı olmaktadır. Bu veri akışı sistemin kendi sunucuları içinde olabilmekte birlikte başka sunucular ile de veri akışı yapılabilmektedir. Yük altında ağ kullanım miktarının %30 ve altı değerlerde olması bu parametre için mükemmel olarak kabul edilebilir. Ağ alt yapısının çok iyi olduğu veya kullanım yoğunluğuna göre yüksek kapasitede bir bant genişliğine sahip olduğu çıkarımı yapılmaktadır. Bu parametre özelinde ağ için herhangi bir geliştirme yapılmasına gerek olmadığı düşünülmüştür.\n";
    public final static String NETWORK_90="Yük altında sistem üzerinde veri akışı olmaktadır. Bu veri akışı sistemin kendi sunucuları içinde olabilmekte birlikte başka sunucular ile de veri akışı yapılabilmektedir. Yük altında ağ kullanım miktarının %30 ile %50 arasında olması bu parametre için çok iyi bir değer olarak kabul edilebilir. Yani sistemin en yoğun halinde bile ağ trafiğinin bant genişliğinin yarısı hatta yarıdan fazlasının kullanılmadığı görülmektedir. Buradan şu çıkarımı yapabilmel mümkünüdür: Ağ altyapısı çok güçlü veya kullanım yoğunluğunun ağ bant genişliğine oranı düşük her iki durumda da bu parametre özelinde herhangi bir geliştirme veya iyileştirme yapılmasına gerek olmadığı düşünülmektedir.\n";
    public final static String NETWORK_80="Yük altında sistem üzerinde veri akışı olmaktadır. Bu veri akışı sistemin kendi sunucuları içinde olabilmekte birlikte başka sunucular ile de veri akışı yapılabilmektedir. Yük altında ağ kullanım miktarının %50 ile %70 arasında olduğu görülmektedir. Bu parametre için ortalama bir değer olarak kabul edilebilir. Sistemin anlık durumuna göre yeterli bir alt yapı olarak görülebilir fakat ileride sistemin daha yoğun kullanım altında ağ alt yapısının yetemeyeceği göz önüne alınmalıdır. Sistemin kullanım artış oranları göz önünde bulundurularak kullanıcı sayısı ve yoğunluğu artışı miktarına göre ağ alt yapısında iyileştirilmelerin yapılması tavsiye edilebilir.\n";
    public final static String NETWORK_40="Yük altında sistem üzerinde veri akışı olmaktadır. Bu veri akışı sistemin kendi sunucuları içinde olabilmekte birlikte başka sunucular ile de veri akışı yapılabilmektedir. Yük altında ağ kullanım miktarının %70'in üzerinde olduğu durum yoğun miktarda ağ kullanım olduğu bir durumdur. Ağ trafiği iyice izlenip analiz edilmelidir. Ağ yük altında %90 bandının altında kalıyorsa sistemin işleyişinde bir sorun yok fakat yük miktarının artması ile birlikte gecikmelerin olabileceği verilerin kayıp olabileceği göz önünde bulundurulmalıdır. Bu değerlere sahip ağ yapısının bulunduğu sistemler için altyapı bant genişliklerinin ağ kullanım oranı optimum seviyeye gelene kadar geliştirilmesi tavsiye edilmektedir.\n";

    public final static String MEMORY_100="Bellek kullanımı sistemler için oldukça önemli bir parametredir. Bellekte depolanan verilere dahili elektronik veya fiziksel disklere göre çok daha hızlı erişme imkanı sunar. Bu yüzden işlenecek veriler önce sabit diskten belleğe alınır. Yük altında sistemin bellek kullanım oranın %30 seviyesinden daha az olduğu görülmektedir. Bu parametre için mükemmel sayılabilecek bir değerdir. Buradan iki farklı çıkarım yapılabilir ya bellek boyutu sisteme göre çok fazladır ya da sistemdeki kullanıcı bellek kulnım oranı oldukça düşüktür. Kısaca bu parametre için bu bellek kullanım oranı mükemmel seviyedir ve sistem yük miktarı bu seviyelerde kaldığı sürece geliştirilmesine gerek olmayacaktır.\n";
    public final static String MEMORY_85="Bellek kullanımı sistemler için oldukça önemli bir parametredir. Bellekte depolanan verilere dahili elektronik veya fiziksel disklere göre çok daha hızlı erişme imkanı sunar. Bu yüzden işlenecek veriler önce sabit diskten belleğe alınır. Yük altında sistemin bellek kullanım oranın %30 ile %45 değerleri arasında olduğu görülmektedir. Bu değer bir sistem için yük altında alınabilecek çok iyi bir değerdir. Yük miktarı kullanım yoğunluğu bu seviyede olduğu süre boyunca geliştirilmesine gerek olmayacaktır.\n";
    public final static String MEMORY_70="Bellek kullanımı sistemler için oldukça önemli bir parametredir. Bellekte depolanan verilere dahili elektronik veya fiziksel disklere göre çok daha hızlı erişme imkanı sunar. Bu yüzden işlenecek veriler önce sabit diskten belleğe alınır. Yük altında sistemin bellek kullanım oranın %45 ile %75 aralığında olduğu görülmektedir. Bu miktar yük altındaki sistem için ortalama sayılabilecek bir orandır. Sistemde gecikmeler veya aksaklıkların olması beklenmemektedir bununla birlikte yük miktarı yani kullanım miktarındaki artışlarla birlikte bu bellek kullanım yüzdesinin artacağı ve bir yerden sonra sistemin bellek olarak %100 e ulaşabileceği göz önünde bulundurulmalıdır. Bu yüzden bellek miktarı üzerinde geliştirmeler yapılması tavsiye edilmektedir fakat şart değildir tamamen sistemin davranışına ve kullanım yoğunluğuna göre karar verilmesi gereken bir parametredir.\n";
    public final static String MEMORY_50="Bellek kullanımı sistemler için oldukça önemli bir parametredir. Bellekte depolanan verilere dahili elektronik veya fiziksel disklere göre çok daha hızlı erişme imkanı sunar. Bu yüzden işlenecek veriler önce sabit diskten belleğe alınır. Yük altında sistemin bellek kullanım oranın %70 ile %90 aralığında olduğu görülmektedir. Bu kullanım miktarı yük altında kullanımda ortalamanın üstünde bir değerdir ve sistem için uyarı sinyallerinin verilebileceği bir noktadadır. Yük miktarındaki ufak artışlarda bellek miktarının kullanımının %100'e ulaşması yüksek olasılıktır bu durumda sistemde veri akışında yavaşlamalar başlayacak sistemin işleyişi aksayabilecektir. Bu olacaklar göz önüne alındığında bellek miktarına artışa gitmenin büyük ölçüde problemi çözebileceği düşünülmektedir. Sistemin daha stabil çalışabilemesi için bellek miktarında iyileştirme yapılması önemle tavsiye edilmektedir.\n";
    public final static String MEMORY_20="Bellek kullanımı sistemler için oldukça önemli bir parametredir. Bellekte depolanan verilere dahili elektronik veya fiziksel disklere göre çok daha hızlı erişme imkanı sunar. Bu yüzden işlenecek veriler önce sabit diskten belleğe alınır. Yük altında sistemin bellek kullanım oranın %90'dan fazla olması sistem için kırmızı alarm olarak sayılabilecek bir orandır. Bellek kullanımının %100 seviyelerine ulaşması çok olasıdır. Bu noktada acilen aksiyon alınıp bellek miktarında ivedilikle iyileştirmelerin yapılması sistemin stabil çalışmasını için büyük ölçüde önem arz etmektedir.\n";

    public final static String CPU_100="İşlemci bilgisayarın tüm matematiksel ve lojik işlemlerinin yapıldığı merkezi işlem birimidir. Kullanıcı işlemlerinin tamamının işlemci üzerinde yapıldığı öncelikle bilinmelidir.\n" +
            "Sistemde işlemlerin yapılma hızı işlemcinin sahip olduğu çekirdek sayısı, çalışma frekansı dolaylı olarak tükettiği güç miktarı ile doğru orantılıdır. Yük testinde sistemin yoğun kullanımı sırasında işlemci kullanım oranı girilen parametreye göre %20 ile %40 seviyesinde görülmektedir. Bu bir sistem için mükemmel kabul edilecek bir değerdir. Buradan iki farklı çıkarım yapılabilir ya işlemci sisteme göre çok üst düzey bir işlemcidir ya da yük testi veya yoğun kullanımda dahi sistemi fazla bir kullanım yoğunluğu oluşmuyor bu yüzden kullanım yüzdeleri düşük kalmaktadır. Sonuç olarak işlemci kullanımı mükemmel seviyede olduğundan bu parametre için herhangi bir iyileştirme yapılmasına gerek yoktur.\n";
    public final static String CPU_85="İşlemci bilgisayarın tüm matematiksel ve lojik işlemlerinin yapıldığı merkezi işlem birimidir. Kullanıcı işlemlerinin tamamının işlemci üzerinde yapıldığı öncelikle bilinmelidir.\n" +
            "Sistemde işlemlerin yapılma hızı işlemcinin sahip olduğu çekirdek sayısı, çalışma frekansı dolaylı olarak tükettiği güç miktarı ile doğru orantılıdır. Yük testinde sistemin yoğun kullanımı sırasında işlemci kullanım oranı girilen parametreye göre %40 ile %60 aralığında olduğu görülmektedir. Bu kullanım miktarı yoğun kullanıma göre ortalamanın altında bir değerdir ve çok gerek duyulmadıkça işlem yoğunluğunun büyük ölçüde artacağı düşünülmüyor ise bu parametre üzerinde iyileştirme yapılmasına gerek yoktur.\n";
    public final static String CPU_70="İşlemci bilgisayarın tüm matematiksel ve lojik işlemlerinin yapıldığı merkezi işlem birimidir. Kullanıcı işlemlerinin tamamının işlemci üzerinde yapıldığı öncelikle bilinmelidir.\n" +
            "Sistemde işlemlerin yapılma hızı işlemcinin sahip olduğu çekirdek sayısı, çalışma frekansı dolaylı olarak tükettiği güç miktarı ile doğru orantılıdır. Yük testinde sistemin yoğun kullanımı sırasında işlemci kullanım oranı girilen parametreye göre %60 ile %80 aralığında olduğu görülmektedir. Bu kullanım ortalama kullanım miktarı ya da ortalamanın biraz üzerinde bir kullanım oranı olarak değerlendirilebilir. Sistemin kullanım yoğunluğunun aynı seviyelerde kalacağı ön görülebiliyorsa bu parametre üzerinde değişiklik yapılmayabilir. Fakat genelde sistemlerin kullanım yoğunluklarının arttığı veri miktarlarının büyüdüğü göz önüne alındığında bu durumda sistemin işlemci kullanım parametresinin iyileştirilmesi için bir takım altyapısal veya yazılımsal iyileştirmelerin gerekli olduğu düşünülebilir bu yüzden gerekli aksiyonların alınarak iyileştirmelerin yapılması tavsiye edilmektedir.\n";
    public final static String CPU_40="İşlemci bilgisayarın tüm matematiksel ve lojik işlemlerinin yapıldığı merkezi işlem birimidir. Kullanıcı işlemlerinin tamamının işlemci üzerinde yapıldığı öncelikle bilinmelidir.\n" +
            "Sistemde işlemlerin yapılma hızı işlemcinin sahip olduğu çekirdek sayısı, çalışma frekansı dolaylı olarak tükettiği güç miktarı ile doğru orantılıdır. Yük testinde sistemin yoğun kullanımı sırasında işlemci kullanım oranı girilen parametreye göre %80 ile %100 aralığında olduğu görülmektedir. Bu kullanım yük altında da olsa yüksek bir kullanım miktarıdır. Sistemin işlemleri gerektiği gibi zamanında yapabilmesi için acilen sistemde iyileştirilmelerin yapılması şiddetle tavsiye edilmektedir.\n";

    public final static String DISK_100="Disk kullanımı, sistemlerde çok büyük veride dosyaların bulunduğunu ve bunların depolanması için kullanılan fiziki veya elektronik disklerin yük altında yoğun kullanımda kullanım oranı olarak kabul edilir. Diskler iki farklı durumlarda kullanılır birincisi ilk defa bir veri getirileceği zaman yani belleğe yükleneceği zaman disk üzerinde kullanım olur ikinci kullanım senaryosu ise ram bellek kullanımı %100'e ulaştığı zaman disklerin bir kısmı ram için ramden daha yavaş şekilde çalışırlar. Yük altında girilen parametre değerine göre %30 disk kullanım oranı kritlere göre mükemmel olarak kabul edilmektedir. Bu parametre üzerinde herhangi bir iyileştirmeye gerek yoktur.\n";
    public final static String DISK_85="Disk kullanımı, sistemlerde çok büyük veride dosyaların bulunduğunu ve bunların depolanması için kullanılan fiziki veya elektronik disklerin yük altında yoğun kullanımda kullanım oranı olarak kabul edilir. Diskler iki farklı durumlarda kullanılır birincisi ilk defa bir veri getirileceği zaman yani belleğe yükleneceği zaman disk üzerinde kullanım olur ikinci kullanım senaryosu ise ram bellek kullanımı %100'e ulaştığı zaman disklerin bir kısmı ram için ramden daha yavaş şekilde çalışırlar. Yük altında girilen parametre değerine göre %30 ile %50 arasında olduğu görülmektedir. Bu yük altında yoğun kullanımlarda iyi bir değer olarak kabul edilebilir. Yoğunluğun çok artmayacağı ön görülebiliyorsa bu parametre üzerinde iyileştirme yapılmasına gerek yoktur.\n";
    public final static String DISK_60="Disk kullanımı, sistemlerde çok büyük veride dosyaların bulunduğunu ve bunların depolanması için kullanılan fiziki veya elektronik disklerin yük altında yoğun kullanımda kullanım oranı olarak kabul edilir. Diskler iki farklı durumlarda kullanılır birincisi ilk defa bir veri getirileceği zaman yani belleğe yükleneceği zaman disk üzerinde kullanım olur ikinci kullanım senaryosu ise ram bellek kullanımı %100'e ulaştığı zaman disklerin bir kısmı ram için ramden daha yavaş şekilde çalışırlar. Yük altında girilen parametre değerine göre %50 ile %75 arasında olduğu görülmektedir. Bu kullanım oranı ortalama ya da ortalama üstü bir kullanım oranı olarak gözükebilir bunun bahsettiğimiz gibi iki farklı nedeni olabilir ya bellek yeterli değildir ya da çok büyük bir veri çekişi olmuş olabilir. Hangisi oluyorsa olsun bu oran iyileştirilmesi gereken bir orandır. Sistemin daha hızlı çalışabilmesi ve istenileni verebilmesi için disk kullanım parametresinin iyileştirilmesi tavsiye edilmektedir. Bunun için disk miktarı arttırılabilir, ram bellek miktarı arttırılabilir ya da veriler bölünerek farklı disklere aktarılabilir.\n";
    public final static String DISK_30="Disk kullanımı, sistemlerde çok büyük veride dosyaların bulunduğunu ve bunların depolanması için kullanılan fiziki veya elektronik disklerin yük altında yoğun kullanımda kullanım oranı olarak kabul edilir. Diskler iki farklı durumlarda kullanılır birincisi ilk defa bir veri getirileceği zaman yani belleğe yükleneceği zaman disk üzerinde kullanım olur ikinci kullanım senaryosu ise ram bellek kullanımı %100'e ulaştığı zaman disklerin bir kısmı ram için ramden daha yavaş şekilde çalışırlar. Yük altında girilen parametre değerine göre %75 ile %100 arasında olduğu gözükmektedir. Bu parametre için en kötü değer sınıfı olarak gösterebiliriz. Bu değerin acilen iyileştirilmesi gerekmektedir. Bunun yapılmaması halinde sistemde veriden kaynaklanan gecikmeler yaşanması olasıdır. Bunun için disk miktarı arttırılabilir, ram bellek miktarı arttırılabilir ya da veriler bölünerek farklı disklere aktarılabilir.\n";

    public final static String CONCLUSION="Sonuç olarak, yukarıda parametrelere göre ayrıntılı olarak sistemin incelenmesi ve yerine göre yapılması gerekenler açıklanmıştır. Sistemlerin birbirinden farklı amaçları ve hedefleri olduğu unutulmamalıdır. Yukarıda yapılan tavsiyeler genel nitelikte olup sistem iyileştirmeleri gereklilik durumunda sistemin daha stabil ve güvenli çalışması için erkenden de yapılmasında bir engel olmadığı unutulmamalıdır.\n";

    public final static String ENTRY="IT sistemleri günümüz dünyasında her alanda her sistemde kullanılıyor. Artık sistemleri her yerde kullanmaktan ziyade bunları en performanslı ve verimli nasıl kullılabilir sorularına yanıt bulunmaya çalışılıyor. Bu alanda artık bir standart olan ITIL V4 standartına uygun olacak şekilde girilen parametrelerin değerlerinin değerlendirmesi yapılacak ve bu alanlarda geliştirmeler hakkında bilgiler ve tavsiyeler verilecektir.\n";






}