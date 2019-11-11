package cn.gwjjj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerDatailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerDatailsExample() {
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

        public Criteria andPlayerIdIsNull() {
            addCriterion("PLAYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("PLAYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Integer value) {
            addCriterion("PLAYER_ID =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Integer value) {
            addCriterion("PLAYER_ID <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Integer value) {
            addCriterion("PLAYER_ID >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_ID >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Integer value) {
            addCriterion("PLAYER_ID <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_ID <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Integer> values) {
            addCriterion("PLAYER_ID in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Integer> values) {
            addCriterion("PLAYER_ID not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_ID between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_ID not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNull() {
            addCriterion("PLAYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNotNull() {
            addCriterion("PLAYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameEqualTo(String value) {
            addCriterion("PLAYER_NAME =", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotEqualTo(String value) {
            addCriterion("PLAYER_NAME <>", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThan(String value) {
            addCriterion("PLAYER_NAME >", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYER_NAME >=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThan(String value) {
            addCriterion("PLAYER_NAME <", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThanOrEqualTo(String value) {
            addCriterion("PLAYER_NAME <=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLike(String value) {
            addCriterion("PLAYER_NAME like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotLike(String value) {
            addCriterion("PLAYER_NAME not like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIn(List<String> values) {
            addCriterion("PLAYER_NAME in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotIn(List<String> values) {
            addCriterion("PLAYER_NAME not in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameBetween(String value1, String value2) {
            addCriterion("PLAYER_NAME between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotBetween(String value1, String value2) {
            addCriterion("PLAYER_NAME not between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerConIsNull() {
            addCriterion("PLAYER_CON is null");
            return (Criteria) this;
        }

        public Criteria andPlayerConIsNotNull() {
            addCriterion("PLAYER_CON is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerConEqualTo(Integer value) {
            addCriterion("PLAYER_CON =", value, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConNotEqualTo(Integer value) {
            addCriterion("PLAYER_CON <>", value, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConGreaterThan(Integer value) {
            addCriterion("PLAYER_CON >", value, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_CON >=", value, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConLessThan(Integer value) {
            addCriterion("PLAYER_CON <", value, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_CON <=", value, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConIn(List<Integer> values) {
            addCriterion("PLAYER_CON in", values, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConNotIn(List<Integer> values) {
            addCriterion("PLAYER_CON not in", values, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_CON between", value1, value2, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerConNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_CON not between", value1, value2, "playerCon");
            return (Criteria) this;
        }

        public Criteria andPlayerBdIsNull() {
            addCriterion("PLAYER_BD is null");
            return (Criteria) this;
        }

        public Criteria andPlayerBdIsNotNull() {
            addCriterion("PLAYER_BD is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerBdEqualTo(Date value) {
            addCriterion("PLAYER_BD =", value, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdNotEqualTo(Date value) {
            addCriterion("PLAYER_BD <>", value, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdGreaterThan(Date value) {
            addCriterion("PLAYER_BD >", value, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAYER_BD >=", value, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdLessThan(Date value) {
            addCriterion("PLAYER_BD <", value, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdLessThanOrEqualTo(Date value) {
            addCriterion("PLAYER_BD <=", value, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdIn(List<Date> values) {
            addCriterion("PLAYER_BD in", values, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdNotIn(List<Date> values) {
            addCriterion("PLAYER_BD not in", values, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdBetween(Date value1, Date value2) {
            addCriterion("PLAYER_BD between", value1, value2, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerBdNotBetween(Date value1, Date value2) {
            addCriterion("PLAYER_BD not between", value1, value2, "playerBd");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoIsNull() {
            addCriterion("PLAYER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoIsNotNull() {
            addCriterion("PLAYER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoEqualTo(String value) {
            addCriterion("PLAYER_INFO =", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoNotEqualTo(String value) {
            addCriterion("PLAYER_INFO <>", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoGreaterThan(String value) {
            addCriterion("PLAYER_INFO >", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYER_INFO >=", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoLessThan(String value) {
            addCriterion("PLAYER_INFO <", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoLessThanOrEqualTo(String value) {
            addCriterion("PLAYER_INFO <=", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoLike(String value) {
            addCriterion("PLAYER_INFO like", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoNotLike(String value) {
            addCriterion("PLAYER_INFO not like", value, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoIn(List<String> values) {
            addCriterion("PLAYER_INFO in", values, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoNotIn(List<String> values) {
            addCriterion("PLAYER_INFO not in", values, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoBetween(String value1, String value2) {
            addCriterion("PLAYER_INFO between", value1, value2, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerInfoNotBetween(String value1, String value2) {
            addCriterion("PLAYER_INFO not between", value1, value2, "playerInfo");
            return (Criteria) this;
        }

        public Criteria andPlayerHotIsNull() {
            addCriterion("PLAYER_HOT is null");
            return (Criteria) this;
        }

        public Criteria andPlayerHotIsNotNull() {
            addCriterion("PLAYER_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerHotEqualTo(Integer value) {
            addCriterion("PLAYER_HOT =", value, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotNotEqualTo(Integer value) {
            addCriterion("PLAYER_HOT <>", value, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotGreaterThan(Integer value) {
            addCriterion("PLAYER_HOT >", value, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_HOT >=", value, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotLessThan(Integer value) {
            addCriterion("PLAYER_HOT <", value, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_HOT <=", value, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotIn(List<Integer> values) {
            addCriterion("PLAYER_HOT in", values, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotNotIn(List<Integer> values) {
            addCriterion("PLAYER_HOT not in", values, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_HOT between", value1, value2, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerHotNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_HOT not between", value1, value2, "playerHot");
            return (Criteria) this;
        }

        public Criteria andPlayerImgIsNull() {
            addCriterion("PLAYER_IMG is null");
            return (Criteria) this;
        }

        public Criteria andPlayerImgIsNotNull() {
            addCriterion("PLAYER_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerImgEqualTo(String value) {
            addCriterion("PLAYER_IMG =", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgNotEqualTo(String value) {
            addCriterion("PLAYER_IMG <>", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgGreaterThan(String value) {
            addCriterion("PLAYER_IMG >", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYER_IMG >=", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgLessThan(String value) {
            addCriterion("PLAYER_IMG <", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgLessThanOrEqualTo(String value) {
            addCriterion("PLAYER_IMG <=", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgLike(String value) {
            addCriterion("PLAYER_IMG like", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgNotLike(String value) {
            addCriterion("PLAYER_IMG not like", value, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgIn(List<String> values) {
            addCriterion("PLAYER_IMG in", values, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgNotIn(List<String> values) {
            addCriterion("PLAYER_IMG not in", values, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgBetween(String value1, String value2) {
            addCriterion("PLAYER_IMG between", value1, value2, "playerImg");
            return (Criteria) this;
        }

        public Criteria andPlayerImgNotBetween(String value1, String value2) {
            addCriterion("PLAYER_IMG not between", value1, value2, "playerImg");
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