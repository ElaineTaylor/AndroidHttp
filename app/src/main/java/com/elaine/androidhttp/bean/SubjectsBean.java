package com.elaine.androidhttp.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author elaine
 * @date 2020/3/23
 */
public class SubjectsBean {
    /**
     * rating : {"max":10,"average":7.1,"details":{"1":6504,"3":37877,"2":10520,"5":23398,"4":41298},"stars":"35","min":0}
     * genres : ["动作","战争"]
     * title : 战狼2
     * casts : [{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"},"name_en":"Jing Wu","name":"吴京","alt":"https://movie.douban.com/celebrity/1000525/","id":"1000525"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415801312.29.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415801312.29.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1415801312.29.webp"},"name_en":"Frank Grillo","name":"弗兰克·格里罗","alt":"https://movie.douban.com/celebrity/1100321/","id":"1100321"},{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1401440361.14.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1401440361.14.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1401440361.14.webp"},"name_en":"Gang Wu","name":"吴刚","alt":"https://movie.douban.com/celebrity/1274840/","id":"1274840"}]
     * durations : ["123分钟"]
     * collect_count : 1372146
     * mainland_pubdate : 2017-07-27
     * has_video : true
     * original_title : 战狼2
     * subtype : movie
     * directors : [{"avatars":{"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"},"name_en":"Jing Wu","name":"吴京","alt":"https://movie.douban.com/celebrity/1000525/","id":"1000525"}]
     * pubdates : ["2017-07-27(中国大陆)","2020-04(中国大陆重映)"]
     * year : 2017
     * images : {"small":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp","large":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp","medium":"http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp"}
     * alt : https://movie.douban.com/subject/26363254/
     * id : 26363254
     */

    private RatingBean rating;
    private String title;
    private int collect_count;
    private String mainland_pubdate;
    private boolean has_video;
    private String original_title;
    private String subtype;
    private String year;
    private ImagesBean images;
    private String alt;
    private String id;
    private List<String> genres;
    private List<CastsBean> casts;
    private List<String> durations;
    private List<DirectorsBean> directors;
    private List<String> pubdates;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getMainland_pubdate() {
        return mainland_pubdate;
    }

    public void setMainland_pubdate(String mainland_pubdate) {
        this.mainland_pubdate = mainland_pubdate;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 7.1
         * details : {"1":6504,"3":37877,"2":10520,"5":23398,"4":41298}
         * stars : 35
         * min : 0
         */

        private int max;
        private double average;
        private DetailsBean details;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public DetailsBean getDetails() {
            return details;
        }

        public void setDetails(DetailsBean details) {
            this.details = details;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public static class DetailsBean {
            /**
             * 1 : 6504.0
             * 3 : 37877.0
             * 2 : 10520.0
             * 5 : 23398.0
             * 4 : 41298.0
             */

            @SerializedName("1")
            private double _$1;
            @SerializedName("3")
            private double _$3;
            @SerializedName("2")
            private double _$2;
            @SerializedName("5")
            private double _$5;
            @SerializedName("4")
            private double _$4;

            public double get_$1() {
                return _$1;
            }

            public void set_$1(double _$1) {
                this._$1 = _$1;
            }

            public double get_$3() {
                return _$3;
            }

            public void set_$3(double _$3) {
                this._$3 = _$3;
            }

            public double get_$2() {
                return _$2;
            }

            public void set_$2(double _$2) {
                this._$2 = _$2;
            }

            public double get_$5() {
                return _$5;
            }

            public void set_$5(double _$5) {
                this._$5 = _$5;
            }

            public double get_$4() {
                return _$4;
            }

            public void set_$4(double _$4) {
                this._$4 = _$4;
            }
        }
    }

    public static class ImagesBean {
        /**
         * small : http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp
         * large : http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp
         * medium : http://img9.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        /**
         * avatars : {"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"}
         * name_en : Jing Wu
         * name : 吴京
         * alt : https://movie.douban.com/celebrity/1000525/
         * id : 1000525
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp
             * large : http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp
             * medium : http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        /**
         * avatars : {"small":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"}
         * name_en : Jing Wu
         * name : 吴京
         * alt : https://movie.douban.com/celebrity/1000525/
         * id : 1000525
         */

        private AvatarsBeanX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp
             * large : http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp
             * medium : http://img9.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
