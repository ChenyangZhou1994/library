package com.imu.library.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userpassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUseridnumberIsNull() {
            addCriterion("useridnumber is null");
            return (Criteria) this;
        }

        public Criteria andUseridnumberIsNotNull() {
            addCriterion("useridnumber is not null");
            return (Criteria) this;
        }

        public Criteria andUseridnumberEqualTo(String value) {
            addCriterion("useridnumber =", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotEqualTo(String value) {
            addCriterion("useridnumber <>", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberGreaterThan(String value) {
            addCriterion("useridnumber >", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberGreaterThanOrEqualTo(String value) {
            addCriterion("useridnumber >=", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberLessThan(String value) {
            addCriterion("useridnumber <", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberLessThanOrEqualTo(String value) {
            addCriterion("useridnumber <=", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberLike(String value) {
            addCriterion("useridnumber like", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotLike(String value) {
            addCriterion("useridnumber not like", value, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberIn(List<String> values) {
            addCriterion("useridnumber in", values, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotIn(List<String> values) {
            addCriterion("useridnumber not in", values, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberBetween(String value1, String value2) {
            addCriterion("useridnumber between", value1, value2, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUseridnumberNotBetween(String value1, String value2) {
            addCriterion("useridnumber not between", value1, value2, "useridnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberIsNull() {
            addCriterion("userjobnumber is null");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberIsNotNull() {
            addCriterion("userjobnumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberEqualTo(String value) {
            addCriterion("userjobnumber =", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberNotEqualTo(String value) {
            addCriterion("userjobnumber <>", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberGreaterThan(String value) {
            addCriterion("userjobnumber >", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("userjobnumber >=", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberLessThan(String value) {
            addCriterion("userjobnumber <", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberLessThanOrEqualTo(String value) {
            addCriterion("userjobnumber <=", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberLike(String value) {
            addCriterion("userjobnumber like", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberNotLike(String value) {
            addCriterion("userjobnumber not like", value, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberIn(List<String> values) {
            addCriterion("userjobnumber in", values, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberNotIn(List<String> values) {
            addCriterion("userjobnumber not in", values, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberBetween(String value1, String value2) {
            addCriterion("userjobnumber between", value1, value2, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserjobnumberNotBetween(String value1, String value2) {
            addCriterion("userjobnumber not between", value1, value2, "userjobnumber");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsIsNull() {
            addCriterion("userlendinglevels is null");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsIsNotNull() {
            addCriterion("userlendinglevels is not null");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsEqualTo(Integer value) {
            addCriterion("userlendinglevels =", value, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsNotEqualTo(Integer value) {
            addCriterion("userlendinglevels <>", value, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsGreaterThan(Integer value) {
            addCriterion("userlendinglevels >", value, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("userlendinglevels >=", value, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsLessThan(Integer value) {
            addCriterion("userlendinglevels <", value, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsLessThanOrEqualTo(Integer value) {
            addCriterion("userlendinglevels <=", value, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsIn(List<Integer> values) {
            addCriterion("userlendinglevels in", values, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsNotIn(List<Integer> values) {
            addCriterion("userlendinglevels not in", values, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsBetween(Integer value1, Integer value2) {
            addCriterion("userlendinglevels between", value1, value2, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUserlendinglevelsNotBetween(Integer value1, Integer value2) {
            addCriterion("userlendinglevels not between", value1, value2, "userlendinglevels");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberIsNull() {
            addCriterion("usercollegenumber is null");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberIsNotNull() {
            addCriterion("usercollegenumber is not null");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberEqualTo(Integer value) {
            addCriterion("usercollegenumber =", value, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberNotEqualTo(Integer value) {
            addCriterion("usercollegenumber <>", value, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberGreaterThan(Integer value) {
            addCriterion("usercollegenumber >", value, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("usercollegenumber >=", value, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberLessThan(Integer value) {
            addCriterion("usercollegenumber <", value, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberLessThanOrEqualTo(Integer value) {
            addCriterion("usercollegenumber <=", value, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberIn(List<Integer> values) {
            addCriterion("usercollegenumber in", values, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberNotIn(List<Integer> values) {
            addCriterion("usercollegenumber not in", values, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberBetween(Integer value1, Integer value2) {
            addCriterion("usercollegenumber between", value1, value2, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsercollegenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("usercollegenumber not between", value1, value2, "usercollegenumber");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneIsNull() {
            addCriterion("usertelephone is null");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneIsNotNull() {
            addCriterion("usertelephone is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneEqualTo(String value) {
            addCriterion("usertelephone =", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotEqualTo(String value) {
            addCriterion("usertelephone <>", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneGreaterThan(String value) {
            addCriterion("usertelephone >", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("usertelephone >=", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneLessThan(String value) {
            addCriterion("usertelephone <", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneLessThanOrEqualTo(String value) {
            addCriterion("usertelephone <=", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneLike(String value) {
            addCriterion("usertelephone like", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotLike(String value) {
            addCriterion("usertelephone not like", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneIn(List<String> values) {
            addCriterion("usertelephone in", values, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotIn(List<String> values) {
            addCriterion("usertelephone not in", values, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneBetween(String value1, String value2) {
            addCriterion("usertelephone between", value1, value2, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotBetween(String value1, String value2) {
            addCriterion("usertelephone not between", value1, value2, "usertelephone");
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