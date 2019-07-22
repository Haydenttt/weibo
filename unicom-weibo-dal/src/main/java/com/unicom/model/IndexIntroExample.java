package com.unicom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexIntroExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexIntroExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumIsNull() {
            addCriterion("day_heat_sum is null");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumIsNotNull() {
            addCriterion("day_heat_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumEqualTo(Integer value) {
            addCriterion("day_heat_sum =", value, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumNotEqualTo(Integer value) {
            addCriterion("day_heat_sum <>", value, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumGreaterThan(Integer value) {
            addCriterion("day_heat_sum >", value, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_heat_sum >=", value, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumLessThan(Integer value) {
            addCriterion("day_heat_sum <", value, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumLessThanOrEqualTo(Integer value) {
            addCriterion("day_heat_sum <=", value, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumIn(List<Integer> values) {
            addCriterion("day_heat_sum in", values, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumNotIn(List<Integer> values) {
            addCriterion("day_heat_sum not in", values, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumBetween(Integer value1, Integer value2) {
            addCriterion("day_heat_sum between", value1, value2, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatSumNotBetween(Integer value1, Integer value2) {
            addCriterion("day_heat_sum not between", value1, value2, "dayHeatSum");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelIsNull() {
            addCriterion("day_heat_level is null");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelIsNotNull() {
            addCriterion("day_heat_level is not null");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelEqualTo(Byte value) {
            addCriterion("day_heat_level =", value, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelNotEqualTo(Byte value) {
            addCriterion("day_heat_level <>", value, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelGreaterThan(Byte value) {
            addCriterion("day_heat_level >", value, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("day_heat_level >=", value, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelLessThan(Byte value) {
            addCriterion("day_heat_level <", value, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelLessThanOrEqualTo(Byte value) {
            addCriterion("day_heat_level <=", value, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelIn(List<Byte> values) {
            addCriterion("day_heat_level in", values, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelNotIn(List<Byte> values) {
            addCriterion("day_heat_level not in", values, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelBetween(Byte value1, Byte value2) {
            addCriterion("day_heat_level between", value1, value2, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("day_heat_level not between", value1, value2, "dayHeatLevel");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartIsNull() {
            addCriterion("day_heat_start is null");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartIsNotNull() {
            addCriterion("day_heat_start is not null");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartEqualTo(String value) {
            addCriterion("day_heat_start =", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartNotEqualTo(String value) {
            addCriterion("day_heat_start <>", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartGreaterThan(String value) {
            addCriterion("day_heat_start >", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartGreaterThanOrEqualTo(String value) {
            addCriterion("day_heat_start >=", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartLessThan(String value) {
            addCriterion("day_heat_start <", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartLessThanOrEqualTo(String value) {
            addCriterion("day_heat_start <=", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartLike(String value) {
            addCriterion("day_heat_start like", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartNotLike(String value) {
            addCriterion("day_heat_start not like", value, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartIn(List<String> values) {
            addCriterion("day_heat_start in", values, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartNotIn(List<String> values) {
            addCriterion("day_heat_start not in", values, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartBetween(String value1, String value2) {
            addCriterion("day_heat_start between", value1, value2, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatStartNotBetween(String value1, String value2) {
            addCriterion("day_heat_start not between", value1, value2, "dayHeatStart");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndIsNull() {
            addCriterion("day_heat_end is null");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndIsNotNull() {
            addCriterion("day_heat_end is not null");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndEqualTo(String value) {
            addCriterion("day_heat_end =", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndNotEqualTo(String value) {
            addCriterion("day_heat_end <>", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndGreaterThan(String value) {
            addCriterion("day_heat_end >", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndGreaterThanOrEqualTo(String value) {
            addCriterion("day_heat_end >=", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndLessThan(String value) {
            addCriterion("day_heat_end <", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndLessThanOrEqualTo(String value) {
            addCriterion("day_heat_end <=", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndLike(String value) {
            addCriterion("day_heat_end like", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndNotLike(String value) {
            addCriterion("day_heat_end not like", value, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndIn(List<String> values) {
            addCriterion("day_heat_end in", values, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndNotIn(List<String> values) {
            addCriterion("day_heat_end not in", values, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndBetween(String value1, String value2) {
            addCriterion("day_heat_end between", value1, value2, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatEndNotBetween(String value1, String value2) {
            addCriterion("day_heat_end not between", value1, value2, "dayHeatEnd");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgIsNull() {
            addCriterion("day_heat_avg is null");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgIsNotNull() {
            addCriterion("day_heat_avg is not null");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgEqualTo(Integer value) {
            addCriterion("day_heat_avg =", value, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgNotEqualTo(Integer value) {
            addCriterion("day_heat_avg <>", value, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgGreaterThan(Integer value) {
            addCriterion("day_heat_avg >", value, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_heat_avg >=", value, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgLessThan(Integer value) {
            addCriterion("day_heat_avg <", value, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgLessThanOrEqualTo(Integer value) {
            addCriterion("day_heat_avg <=", value, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgIn(List<Integer> values) {
            addCriterion("day_heat_avg in", values, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgNotIn(List<Integer> values) {
            addCriterion("day_heat_avg not in", values, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgBetween(Integer value1, Integer value2) {
            addCriterion("day_heat_avg between", value1, value2, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andDayHeatAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("day_heat_avg not between", value1, value2, "dayHeatAvg");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
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