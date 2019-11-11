package cn.gwjjj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MusicDatailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicDatailsExample() {
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

        public Criteria andMusicIdIsNull() {
            addCriterion("MUSIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andMusicIdIsNotNull() {
            addCriterion("MUSIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMusicIdEqualTo(Integer value) {
            addCriterion("MUSIC_ID =", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotEqualTo(Integer value) {
            addCriterion("MUSIC_ID <>", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThan(Integer value) {
            addCriterion("MUSIC_ID >", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MUSIC_ID >=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThan(Integer value) {
            addCriterion("MUSIC_ID <", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThanOrEqualTo(Integer value) {
            addCriterion("MUSIC_ID <=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdIn(List<Integer> values) {
            addCriterion("MUSIC_ID in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotIn(List<Integer> values) {
            addCriterion("MUSIC_ID not in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdBetween(Integer value1, Integer value2) {
            addCriterion("MUSIC_ID between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MUSIC_ID not between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNull() {
            addCriterion("MUSIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNotNull() {
            addCriterion("MUSIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMusicNameEqualTo(String value) {
            addCriterion("MUSIC_NAME =", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotEqualTo(String value) {
            addCriterion("MUSIC_NAME <>", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThan(String value) {
            addCriterion("MUSIC_NAME >", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThanOrEqualTo(String value) {
            addCriterion("MUSIC_NAME >=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThan(String value) {
            addCriterion("MUSIC_NAME <", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThanOrEqualTo(String value) {
            addCriterion("MUSIC_NAME <=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLike(String value) {
            addCriterion("MUSIC_NAME like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotLike(String value) {
            addCriterion("MUSIC_NAME not like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameIn(List<String> values) {
            addCriterion("MUSIC_NAME in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotIn(List<String> values) {
            addCriterion("MUSIC_NAME not in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameBetween(String value1, String value2) {
            addCriterion("MUSIC_NAME between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotBetween(String value1, String value2) {
            addCriterion("MUSIC_NAME not between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicPeIsNull() {
            addCriterion("MUSIC_PE is null");
            return (Criteria) this;
        }

        public Criteria andMusicPeIsNotNull() {
            addCriterion("MUSIC_PE is not null");
            return (Criteria) this;
        }

        public Criteria andMusicPeEqualTo(String value) {
            addCriterion("MUSIC_PE =", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeNotEqualTo(String value) {
            addCriterion("MUSIC_PE <>", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeGreaterThan(String value) {
            addCriterion("MUSIC_PE >", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeGreaterThanOrEqualTo(String value) {
            addCriterion("MUSIC_PE >=", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeLessThan(String value) {
            addCriterion("MUSIC_PE <", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeLessThanOrEqualTo(String value) {
            addCriterion("MUSIC_PE <=", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeLike(String value) {
            addCriterion("MUSIC_PE like", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeNotLike(String value) {
            addCriterion("MUSIC_PE not like", value, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeIn(List<String> values) {
            addCriterion("MUSIC_PE in", values, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeNotIn(List<String> values) {
            addCriterion("MUSIC_PE not in", values, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeBetween(String value1, String value2) {
            addCriterion("MUSIC_PE between", value1, value2, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicPeNotBetween(String value1, String value2) {
            addCriterion("MUSIC_PE not between", value1, value2, "musicPe");
            return (Criteria) this;
        }

        public Criteria andMusicCreateIsNull() {
            addCriterion("MUSIC_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andMusicCreateIsNotNull() {
            addCriterion("MUSIC_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andMusicCreateEqualTo(Date value) {
            addCriterion("MUSIC_CREATE =", value, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateNotEqualTo(Date value) {
            addCriterion("MUSIC_CREATE <>", value, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateGreaterThan(Date value) {
            addCriterion("MUSIC_CREATE >", value, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("MUSIC_CREATE >=", value, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateLessThan(Date value) {
            addCriterion("MUSIC_CREATE <", value, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateLessThanOrEqualTo(Date value) {
            addCriterion("MUSIC_CREATE <=", value, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateIn(List<Date> values) {
            addCriterion("MUSIC_CREATE in", values, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateNotIn(List<Date> values) {
            addCriterion("MUSIC_CREATE not in", values, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateBetween(Date value1, Date value2) {
            addCriterion("MUSIC_CREATE between", value1, value2, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicCreateNotBetween(Date value1, Date value2) {
            addCriterion("MUSIC_CREATE not between", value1, value2, "musicCreate");
            return (Criteria) this;
        }

        public Criteria andMusicInfIsNull() {
            addCriterion("MUSIC_INF is null");
            return (Criteria) this;
        }

        public Criteria andMusicInfIsNotNull() {
            addCriterion("MUSIC_INF is not null");
            return (Criteria) this;
        }

        public Criteria andMusicInfEqualTo(String value) {
            addCriterion("MUSIC_INF =", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfNotEqualTo(String value) {
            addCriterion("MUSIC_INF <>", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfGreaterThan(String value) {
            addCriterion("MUSIC_INF >", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfGreaterThanOrEqualTo(String value) {
            addCriterion("MUSIC_INF >=", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfLessThan(String value) {
            addCriterion("MUSIC_INF <", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfLessThanOrEqualTo(String value) {
            addCriterion("MUSIC_INF <=", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfLike(String value) {
            addCriterion("MUSIC_INF like", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfNotLike(String value) {
            addCriterion("MUSIC_INF not like", value, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfIn(List<String> values) {
            addCriterion("MUSIC_INF in", values, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfNotIn(List<String> values) {
            addCriterion("MUSIC_INF not in", values, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfBetween(String value1, String value2) {
            addCriterion("MUSIC_INF between", value1, value2, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicInfNotBetween(String value1, String value2) {
            addCriterion("MUSIC_INF not between", value1, value2, "musicInf");
            return (Criteria) this;
        }

        public Criteria andMusicHotIsNull() {
            addCriterion("MUSIC_HOT is null");
            return (Criteria) this;
        }

        public Criteria andMusicHotIsNotNull() {
            addCriterion("MUSIC_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andMusicHotEqualTo(Integer value) {
            addCriterion("MUSIC_HOT =", value, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotNotEqualTo(Integer value) {
            addCriterion("MUSIC_HOT <>", value, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotGreaterThan(Integer value) {
            addCriterion("MUSIC_HOT >", value, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("MUSIC_HOT >=", value, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotLessThan(Integer value) {
            addCriterion("MUSIC_HOT <", value, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotLessThanOrEqualTo(Integer value) {
            addCriterion("MUSIC_HOT <=", value, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotIn(List<Integer> values) {
            addCriterion("MUSIC_HOT in", values, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotNotIn(List<Integer> values) {
            addCriterion("MUSIC_HOT not in", values, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotBetween(Integer value1, Integer value2) {
            addCriterion("MUSIC_HOT between", value1, value2, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicHotNotBetween(Integer value1, Integer value2) {
            addCriterion("MUSIC_HOT not between", value1, value2, "musicHot");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceIsNull() {
            addCriterion("MUSIC_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceIsNotNull() {
            addCriterion("MUSIC_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceEqualTo(Integer value) {
            addCriterion("MUSIC_PLACE =", value, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceNotEqualTo(Integer value) {
            addCriterion("MUSIC_PLACE <>", value, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceGreaterThan(Integer value) {
            addCriterion("MUSIC_PLACE >", value, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("MUSIC_PLACE >=", value, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceLessThan(Integer value) {
            addCriterion("MUSIC_PLACE <", value, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("MUSIC_PLACE <=", value, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceIn(List<Integer> values) {
            addCriterion("MUSIC_PLACE in", values, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceNotIn(List<Integer> values) {
            addCriterion("MUSIC_PLACE not in", values, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceBetween(Integer value1, Integer value2) {
            addCriterion("MUSIC_PLACE between", value1, value2, "musicPlace");
            return (Criteria) this;
        }

        public Criteria andMusicPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("MUSIC_PLACE not between", value1, value2, "musicPlace");
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