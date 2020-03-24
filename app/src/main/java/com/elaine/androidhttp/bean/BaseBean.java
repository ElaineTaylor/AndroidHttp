package com.elaine.androidhttp.bean;

/**
 * 基础类
 *一般服务的返回的数据如下：
 * {
 *     msg:"请求成功";
 *     code:200;
 *     data:{"userId":"200001","nickname":"elaine"}
 * }
 *
 * 根据返回的数据可以抽象出一个基础类,然后添加get()和set()方法
 * 例如：
 * public class BaseBean{
 *    private String msg;
 *    private int code;
 *    private Object data;
 * }
 *
 *
 * @author elaine
 * @date 2020/3/23
 */
public class BaseBean {

    /**
     * count : 10
     * start : 0
     * total : 6
     * subjects : [{"rating":{"max":10,"average":7.1,"details":{"1":6504,"3":37877,"2":10520,"5":23398,"4":41298},"stars":"35","min":0},"genres":["动作","战争"],"title":"战狼2","casts":[{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"},"name_en":"Jing Wu","name":"吴京","alt":"https://movie.douban.com/celebrity/1000525/","id":"1000525"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415801312.29.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415801312.29.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415801312.29.webp"},"name_en":"Frank Grillo","name":"弗兰克·格里罗","alt":"https://movie.douban.com/celebrity/1100321/","id":"1100321"},{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1401440361.14.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1401440361.14.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1401440361.14.webp"},"name_en":"Gang Wu","name":"吴刚","alt":"https://movie.douban.com/celebrity/1274840/","id":"1274840"}],"durations":["123分钟"],"collect_count":1372146,"mainland_pubdate":"2017-07-27","has_video":true,"original_title":"战狼2","subtype":"movie","directors":[{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"},"name_en":"Jing Wu","name":"吴京","alt":"https://movie.douban.com/celebrity/1000525/","id":"1000525"}],"pubdates":["2017-07-27(中国大陆)","2020-04(中国大陆重映)"],"year":"2017","images":{"small":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp","large":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp","medium":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp"},"alt":"https://movie.douban.com/subject/26363254/","id":"26363254"},{"rating":{"max":10,"average":7.2,"details":{"1":369,"3":18213,"2":2748,"5":6675,"4":16279},"stars":"35","min":0},"genres":["喜剧","动画","冒险"],"title":"冰雪奇缘2","casts":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1395152016.01.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1395152016.01.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1395152016.01.webp"},"name_en":"Kristen Bell","name":"克里斯汀·贝尔","alt":"https://movie.douban.com/celebrity/1031240/","id":"1031240"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1397731339.63.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1397731339.63.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1397731339.63.webp"},"name_en":"Idina Menzel","name":"伊迪娜·门泽尔","alt":"https://movie.douban.com/celebrity/1116746/","id":"1116746"},{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392108916.14.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392108916.14.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392108916.14.webp"},"name_en":"Josh Gad","name":"乔什·加德","alt":"https://movie.douban.com/celebrity/1305235/","id":"1305235"}],"durations":["104分钟"],"collect_count":291499,"mainland_pubdate":"2019-11-22","has_video":true,"original_title":"Frozen II","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48399.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48399.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48399.webp"},"name_en":"Chris Buck","name":"克里斯·巴克","alt":"https://movie.douban.com/celebrity/1279552/","id":"1279552"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392548591.79.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392548591.79.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392548591.79.webp"},"name_en":"Jennifer Lee","name":"珍妮弗·李","alt":"https://movie.douban.com/celebrity/1335174/","id":"1335174"}],"pubdates":["2019-11-22(美国)","2019-11-22(中国大陆)"],"year":"2019","images":{"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2572847101.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2572847101.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2572847101.webp"},"alt":"https://movie.douban.com/subject/25887288/","id":"25887288"},{"rating":{"max":10,"average":5.2,"details":{"1":125,"3":665,"2":579,"5":33,"4":133},"stars":"25","min":0},"genres":["惊悚","冒险"],"title":"鲨海逃生","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p10899.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p10899.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p10899.webp"},"name_en":"Nia Long","name":"尼娅·朗","alt":"https://movie.douban.com/celebrity/1040570/","id":"1040570"},{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2255.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2255.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2255.webp"},"name_en":"John Corbett","name":"约翰·考伯特","alt":"https://movie.douban.com/celebrity/1044870/","id":"1044870"},{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1548144197.26.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1548144197.26.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1548144197.26.webp"},"name_en":"Sophie Nélisse","name":"苏菲·奈丽丝","alt":"https://movie.douban.com/celebrity/1323944/","id":"1323944"}],"durations":["89分钟"],"collect_count":11931,"mainland_pubdate":"2020-01-10","has_video":true,"original_title":"47 Meters Down: Uncaged","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498455992.67.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498455992.67.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498455992.67.webp"},"name_en":"Johannes Roberts","name":"约翰内斯·罗伯茨","alt":"https://movie.douban.com/celebrity/1019388/","id":"1019388"}],"pubdates":["2019-08-16(美国)","2020-01-10(中国大陆)"],"year":"2019","images":{"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2578721161.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2578721161.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2578721161.webp"},"alt":"https://movie.douban.com/subject/27186353/","id":"27186353"},{"rating":{"max":10,"average":0,"details":{"1":0,"3":0,"2":0,"5":0,"4":0},"stars":"00","min":0},"genres":["剧情","动画"],"title":"士兵顺溜：兵王争锋","casts":[{"avatars":null,"name_en":"","name":"李正翔","alt":null,"id":null},{"avatars":null,"name_en":"","name":"李晔","alt":null,"id":null},{"avatars":null,"name_en":"","name":"胡谦","alt":null,"id":null}],"durations":["83分钟"],"collect_count":276,"mainland_pubdate":"2020-01-17","has_video":false,"original_title":"士兵顺溜：兵王争锋","subtype":"movie","directors":[{"avatars":null,"name_en":"","name":"卢德响","alt":null,"id":null}],"pubdates":["2020-01-17(中国大陆)"],"year":"2020","images":{"small":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2577460914.webp","large":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2577460914.webp","medium":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2577460914.webp"},"alt":"https://movie.douban.com/subject/34911972/","id":"34911972"},{"rating":{"max":10,"average":0,"details":{"1":0,"3":0,"2":0,"5":0,"4":0},"stars":"00","min":0},"genres":["剧情","爱情"],"title":"蓝色百褶裙","casts":[{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1361167833.54.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1361167833.54.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1361167833.54.webp"},"name_en":"Zhuo Rong","name":"蓉卓","alt":"https://movie.douban.com/celebrity/1316459/","id":"1316459"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1553317792.87.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1553317792.87.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1553317792.87.webp"},"name_en":"Fang Wang","name":"王放","alt":"https://movie.douban.com/celebrity/1322026/","id":"1322026"},{"avatars":{"small":"http://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"Yao Shu","name":"舒遥","alt":"https://movie.douban.com/celebrity/1331566/","id":"1331566"}],"durations":["100分钟"],"collect_count":32,"mainland_pubdate":"2019-12-28","has_video":false,"original_title":"蓝色百褶裙","subtype":"movie","directors":[{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1361167833.54.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1361167833.54.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1361167833.54.webp"},"name_en":"Zhuo Rong","name":"蓉卓","alt":"https://movie.douban.com/celebrity/1316459/","id":"1316459"}],"pubdates":["2019-12-28(中国大陆)"],"year":"2019","images":{"small":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2577809025.webp","large":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2577809025.webp","medium":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2577809025.webp"},"alt":"https://movie.douban.com/subject/34911987/","id":"34911987"},{"rating":{"max":10,"average":0,"details":{"1":0,"3":0,"2":0,"5":0,"4":0},"stars":"00","min":0},"genres":["剧情","爱情"],"title":"那人那事","casts":[{"avatars":null,"name_en":"","name":"姚成金","alt":null,"id":null},{"avatars":null,"name_en":"","name":"陈雪铫","alt":null,"id":null},{"avatars":null,"name_en":"","name":"李建忠","alt":null,"id":null}],"durations":["91分钟"],"collect_count":40,"mainland_pubdate":"2020-01-11","has_video":false,"original_title":"那人那事","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"","name":"冯嘉龙 ","alt":"https://movie.douban.com/celebrity/1423174/","id":"1423174"}],"pubdates":["2020-01-11(中国大陆)"],"year":"2020","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2578345157.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2578345157.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2578345157.webp"},"alt":"https://movie.douban.com/subject/34913580/","id":"34913580"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private Object subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getSubjects() {
        return subjects;
    }

    public void setSubjects(Object subjects) {
        this.subjects = subjects;
    }
}
