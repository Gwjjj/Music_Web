package cn.gwjjj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaylistDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaylistDetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPlaylistIdIsNull() {
            addCriterion("PLAYLIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdIsNotNull() {
            addCriterion("PLAYLIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdEqualTo(Integer value) {
            addCriterion("PLAYLIST_ID =", value, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdNotEqualTo(Integer value) {
            addCriterion("PLAYLIST_ID <>", value, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdGreaterThan(Integer value) {
            addCriterion("PLAYLIST_ID >", value, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYLIST_ID >=", value, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdLessThan(Integer value) {
            addCriterion("PLAYLIST_ID <", value, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYLIST_ID <=", value, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdIn(List<Integer> values) {
            addCriterion("PLAYLIST_ID in", values, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdNotIn(List<Integer> values) {
            addCriterion("PLAYLIST_ID not in", values, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdBetween(Integer value1, Integer value2) {
            addCriterion("PLAYLIST_ID between", value1, value2, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYLIST_ID not between", value1, value2, "playlistId");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameIsNull() {
            addCriterion("PLAYLIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameIsNotNull() {
            addCriterion("PLAYLIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameEqualTo(String value) {
            addCriterion("PLAYLIST_NAME =", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameNotEqualTo(String value) {
            addCriterion("PLAYLIST_NAME <>", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameGreaterThan(String value) {
            addCriterion("PLAYLIST_NAME >", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_NAME >=", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameLessThan(String value) {
            addCriterion("PLAYLIST_NAME <", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameLessThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_NAME <=", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameLike(String value) {
            addCriterion("PLAYLIST_NAME like", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameNotLike(String value) {
            addCriterion("PLAYLIST_NAME not like", value, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameIn(List<String> values) {
            addCriterion("PLAYLIST_NAME in", values, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameNotIn(List<String> values) {
            addCriterion("PLAYLIST_NAME not in", values, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameBetween(String value1, String value2) {
            addCriterion("PLAYLIST_NAME between", value1, value2, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistNameNotBetween(String value1, String value2) {
            addCriterion("PLAYLIST_NAME not between", value1, value2, "playlistName");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridIsNull() {
            addCriterion("PLAYLIST_USERID is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridIsNotNull() {
            addCriterion("PLAYLIST_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridEqualTo(Integer value) {
            addCriterion("PLAYLIST_USERID =", value, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridNotEqualTo(Integer value) {
            addCriterion("PLAYLIST_USERID <>", value, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridGreaterThan(Integer value) {
            addCriterion("PLAYLIST_USERID >", value, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYLIST_USERID >=", value, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridLessThan(Integer value) {
            addCriterion("PLAYLIST_USERID <", value, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYLIST_USERID <=", value, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridIn(List<Integer> values) {
            addCriterion("PLAYLIST_USERID in", values, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridNotIn(List<Integer> values) {
            addCriterion("PLAYLIST_USERID not in", values, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridBetween(Integer value1, Integer value2) {
            addCriterion("PLAYLIST_USERID between", value1, value2, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYLIST_USERID not between", value1, value2, "playlistUserid");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicIsNull() {
            addCriterion("PLAYLIST_MUSIC is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicIsNotNull() {
            addCriterion("PLAYLIST_MUSIC is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicEqualTo(String value) {
            addCriterion("PLAYLIST_MUSIC =", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicNotEqualTo(String value) {
            addCriterion("PLAYLIST_MUSIC <>", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicGreaterThan(String value) {
            addCriterion("PLAYLIST_MUSIC >", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_MUSIC >=", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicLessThan(String value) {
            addCriterion("PLAYLIST_MUSIC <", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicLessThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_MUSIC <=", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicLike(String value) {
            addCriterion("PLAYLIST_MUSIC like", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicNotLike(String value) {
            addCriterion("PLAYLIST_MUSIC not like", value, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicIn(List<String> values) {
            addCriterion("PLAYLIST_MUSIC in", values, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicNotIn(List<String> values) {
            addCriterion("PLAYLIST_MUSIC not in", values, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicBetween(String value1, String value2) {
            addCriterion("PLAYLIST_MUSIC between", value1, value2, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistMusicNotBetween(String value1, String value2) {
            addCriterion("PLAYLIST_MUSIC not between", value1, value2, "playlistMusic");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoIsNull() {
            addCriterion("PLAYLIST_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoIsNotNull() {
            addCriterion("PLAYLIST_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoEqualTo(String value) {
            addCriterion("PLAYLIST_INFO =", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoNotEqualTo(String value) {
            addCriterion("PLAYLIST_INFO <>", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoGreaterThan(String value) {
            addCriterion("PLAYLIST_INFO >", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_INFO >=", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoLessThan(String value) {
            addCriterion("PLAYLIST_INFO <", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoLessThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_INFO <=", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoLike(String value) {
            addCriterion("PLAYLIST_INFO like", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoNotLike(String value) {
            addCriterion("PLAYLIST_INFO not like", value, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoIn(List<String> values) {
            addCriterion("PLAYLIST_INFO in", values, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoNotIn(List<String> values) {
            addCriterion("PLAYLIST_INFO not in", values, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoBetween(String value1, String value2) {
            addCriterion("PLAYLIST_INFO between", value1, value2, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistInfoNotBetween(String value1, String value2) {
            addCriterion("PLAYLIST_INFO not between", value1, value2, "playlistInfo");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgIsNull() {
            addCriterion("PLAYLIST_IMG is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgIsNotNull() {
            addCriterion("PLAYLIST_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgEqualTo(String value) {
            addCriterion("PLAYLIST_IMG =", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgNotEqualTo(String value) {
            addCriterion("PLAYLIST_IMG <>", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgGreaterThan(String value) {
            addCriterion("PLAYLIST_IMG >", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_IMG >=", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgLessThan(String value) {
            addCriterion("PLAYLIST_IMG <", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgLessThanOrEqualTo(String value) {
            addCriterion("PLAYLIST_IMG <=", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgLike(String value) {
            addCriterion("PLAYLIST_IMG like", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgNotLike(String value) {
            addCriterion("PLAYLIST_IMG not like", value, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgIn(List<String> values) {
            addCriterion("PLAYLIST_IMG in", values, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgNotIn(List<String> values) {
            addCriterion("PLAYLIST_IMG not in", values, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgBetween(String value1, String value2) {
            addCriterion("PLAYLIST_IMG between", value1, value2, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistImgNotBetween(String value1, String value2) {
            addCriterion("PLAYLIST_IMG not between", value1, value2, "playlistImg");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretIsNull() {
            addCriterion("PLAYLIST_CRET is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretIsNotNull() {
            addCriterion("PLAYLIST_CRET is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretEqualTo(Date value) {
            addCriterion("PLAYLIST_CRET =", value, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretNotEqualTo(Date value) {
            addCriterion("PLAYLIST_CRET <>", value, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretGreaterThan(Date value) {
            addCriterion("PLAYLIST_CRET >", value, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAYLIST_CRET >=", value, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretLessThan(Date value) {
            addCriterion("PLAYLIST_CRET <", value, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretLessThanOrEqualTo(Date value) {
            addCriterion("PLAYLIST_CRET <=", value, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretIn(List<Date> values) {
            addCriterion("PLAYLIST_CRET in", values, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretNotIn(List<Date> values) {
            addCriterion("PLAYLIST_CRET not in", values, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretBetween(Date value1, Date value2) {
            addCriterion("PLAYLIST_CRET between", value1, value2, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistCretNotBetween(Date value1, Date value2) {
            addCriterion("PLAYLIST_CRET not between", value1, value2, "playlistCret");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotIsNull() {
            addCriterion("PLAYLIST_HOT is null");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotIsNotNull() {
            addCriterion("PLAYLIST_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotEqualTo(Integer value) {
            addCriterion("PLAYLIST_HOT =", value, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotNotEqualTo(Integer value) {
            addCriterion("PLAYLIST_HOT <>", value, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotGreaterThan(Integer value) {
            addCriterion("PLAYLIST_HOT >", value, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYLIST_HOT >=", value, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotLessThan(Integer value) {
            addCriterion("PLAYLIST_HOT <", value, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYLIST_HOT <=", value, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotIn(List<Integer> values) {
            addCriterion("PLAYLIST_HOT in", values, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotNotIn(List<Integer> values) {
            addCriterion("PLAYLIST_HOT not in", values, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYLIST_HOT between", value1, value2, "playlistHot");
            return (Criteria) this;
        }

        public Criteria andPlaylistHotNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYLIST_HOT not between", value1, value2, "playlistHot");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}