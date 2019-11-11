package cn.gwjjj.model;

import java.util.ArrayList;
import java.util.List;

public class UserLoginExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserLoginExample() {
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

		public Criteria andLoginIdIsNull() {
			addCriterion("LOGIN_ID is null");
			return (Criteria) this;
		}

		public Criteria andLoginIdIsNotNull() {
			addCriterion("LOGIN_ID is not null");
			return (Criteria) this;
		}

		public Criteria andLoginIdEqualTo(Integer value) {
			addCriterion("LOGIN_ID =", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotEqualTo(Integer value) {
			addCriterion("LOGIN_ID <>", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdGreaterThan(Integer value) {
			addCriterion("LOGIN_ID >", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("LOGIN_ID >=", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLessThan(Integer value) {
			addCriterion("LOGIN_ID <", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdLessThanOrEqualTo(Integer value) {
			addCriterion("LOGIN_ID <=", value, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdIn(List<Integer> values) {
			addCriterion("LOGIN_ID in", values, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotIn(List<Integer> values) {
			addCriterion("LOGIN_ID not in", values, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdBetween(Integer value1, Integer value2) {
			addCriterion("LOGIN_ID between", value1, value2, "loginId");
			return (Criteria) this;
		}

		public Criteria andLoginIdNotBetween(Integer value1, Integer value2) {
			addCriterion("LOGIN_ID not between", value1, value2, "loginId");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNull() {
			addCriterion("USER_PHONE is null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNotNull() {
			addCriterion("USER_PHONE is not null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneEqualTo(String value) {
			addCriterion("USER_PHONE =", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotEqualTo(String value) {
			addCriterion("USER_PHONE <>", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThan(String value) {
			addCriterion("USER_PHONE >", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("USER_PHONE >=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThan(String value) {
			addCriterion("USER_PHONE <", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThanOrEqualTo(String value) {
			addCriterion("USER_PHONE <=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLike(String value) {
			addCriterion("USER_PHONE like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotLike(String value) {
			addCriterion("USER_PHONE not like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIn(List<String> values) {
			addCriterion("USER_PHONE in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotIn(List<String> values) {
			addCriterion("USER_PHONE not in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneBetween(String value1, String value2) {
			addCriterion("USER_PHONE between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotBetween(String value1, String value2) {
			addCriterion("USER_PHONE not between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserMailIsNull() {
			addCriterion("USER_MAIL is null");
			return (Criteria) this;
		}

		public Criteria andUserMailIsNotNull() {
			addCriterion("USER_MAIL is not null");
			return (Criteria) this;
		}

		public Criteria andUserMailEqualTo(String value) {
			addCriterion("USER_MAIL =", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotEqualTo(String value) {
			addCriterion("USER_MAIL <>", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailGreaterThan(String value) {
			addCriterion("USER_MAIL >", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailGreaterThanOrEqualTo(String value) {
			addCriterion("USER_MAIL >=", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailLessThan(String value) {
			addCriterion("USER_MAIL <", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailLessThanOrEqualTo(String value) {
			addCriterion("USER_MAIL <=", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailLike(String value) {
			addCriterion("USER_MAIL like", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotLike(String value) {
			addCriterion("USER_MAIL not like", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailIn(List<String> values) {
			addCriterion("USER_MAIL in", values, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotIn(List<String> values) {
			addCriterion("USER_MAIL not in", values, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailBetween(String value1, String value2) {
			addCriterion("USER_MAIL between", value1, value2, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotBetween(String value1, String value2) {
			addCriterion("USER_MAIL not between", value1, value2, "userMail");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("PASSWORD is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("PASSWORD is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("PASSWORD =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("PASSWORD <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("PASSWORD >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("PASSWORD >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("PASSWORD <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("PASSWORD <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("PASSWORD like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("PASSWORD not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("PASSWORD in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("PASSWORD not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("PASSWORD between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("PASSWORD not between", value1, value2, "password");
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