package com.unicom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventIndicatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventIndicatorExample() {
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

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("event_id like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("event_id not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andAvgVelIsNull() {
            addCriterion("avg_vel is null");
            return (Criteria) this;
        }

        public Criteria andAvgVelIsNotNull() {
            addCriterion("avg_vel is not null");
            return (Criteria) this;
        }

        public Criteria andAvgVelEqualTo(BigDecimal value) {
            addCriterion("avg_vel =", value, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelNotEqualTo(BigDecimal value) {
            addCriterion("avg_vel <>", value, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelGreaterThan(BigDecimal value) {
            addCriterion("avg_vel >", value, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_vel >=", value, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelLessThan(BigDecimal value) {
            addCriterion("avg_vel <", value, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_vel <=", value, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelIn(List<BigDecimal> values) {
            addCriterion("avg_vel in", values, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelNotIn(List<BigDecimal> values) {
            addCriterion("avg_vel not in", values, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_vel between", value1, value2, "avgVel");
            return (Criteria) this;
        }

        public Criteria andAvgVelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_vel not between", value1, value2, "avgVel");
            return (Criteria) this;
        }

        public Criteria andIsEndIsNull() {
            addCriterion("is_end is null");
            return (Criteria) this;
        }

        public Criteria andIsEndIsNotNull() {
            addCriterion("is_end is not null");
            return (Criteria) this;
        }

        public Criteria andIsEndEqualTo(Byte value) {
            addCriterion("is_end =", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotEqualTo(Byte value) {
            addCriterion("is_end <>", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndGreaterThan(Byte value) {
            addCriterion("is_end >", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_end >=", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndLessThan(Byte value) {
            addCriterion("is_end <", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndLessThanOrEqualTo(Byte value) {
            addCriterion("is_end <=", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndIn(List<Byte> values) {
            addCriterion("is_end in", values, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotIn(List<Byte> values) {
            addCriterion("is_end not in", values, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndBetween(Byte value1, Byte value2) {
            addCriterion("is_end between", value1, value2, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotBetween(Byte value1, Byte value2) {
            addCriterion("is_end not between", value1, value2, "isEnd");
            return (Criteria) this;
        }

        public Criteria andMaxVelIsNull() {
            addCriterion("max_vel is null");
            return (Criteria) this;
        }

        public Criteria andMaxVelIsNotNull() {
            addCriterion("max_vel is not null");
            return (Criteria) this;
        }

        public Criteria andMaxVelEqualTo(Integer value) {
            addCriterion("max_vel =", value, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelNotEqualTo(Integer value) {
            addCriterion("max_vel <>", value, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelGreaterThan(Integer value) {
            addCriterion("max_vel >", value, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_vel >=", value, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelLessThan(Integer value) {
            addCriterion("max_vel <", value, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelLessThanOrEqualTo(Integer value) {
            addCriterion("max_vel <=", value, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelIn(List<Integer> values) {
            addCriterion("max_vel in", values, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelNotIn(List<Integer> values) {
            addCriterion("max_vel not in", values, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelBetween(Integer value1, Integer value2) {
            addCriterion("max_vel between", value1, value2, "maxVel");
            return (Criteria) this;
        }

        public Criteria andMaxVelNotBetween(Integer value1, Integer value2) {
            addCriterion("max_vel not between", value1, value2, "maxVel");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeIsNull() {
            addCriterion("continued_time is null");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeIsNotNull() {
            addCriterion("continued_time is not null");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeEqualTo(String value) {
            addCriterion("continued_time =", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeNotEqualTo(String value) {
            addCriterion("continued_time <>", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeGreaterThan(String value) {
            addCriterion("continued_time >", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("continued_time >=", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeLessThan(String value) {
            addCriterion("continued_time <", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeLessThanOrEqualTo(String value) {
            addCriterion("continued_time <=", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeLike(String value) {
            addCriterion("continued_time like", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeNotLike(String value) {
            addCriterion("continued_time not like", value, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeIn(List<String> values) {
            addCriterion("continued_time in", values, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeNotIn(List<String> values) {
            addCriterion("continued_time not in", values, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeBetween(String value1, String value2) {
            addCriterion("continued_time between", value1, value2, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andContinuedTimeNotBetween(String value1, String value2) {
            addCriterion("continued_time not between", value1, value2, "continuedTime");
            return (Criteria) this;
        }

        public Criteria andNearHotInfIsNull() {
            addCriterion("near_hot_inf is null");
            return (Criteria) this;
        }

        public Criteria andNearHotInfIsNotNull() {
            addCriterion("near_hot_inf is not null");
            return (Criteria) this;
        }

        public Criteria andNearHotInfEqualTo(BigDecimal value) {
            addCriterion("near_hot_inf =", value, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfNotEqualTo(BigDecimal value) {
            addCriterion("near_hot_inf <>", value, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfGreaterThan(BigDecimal value) {
            addCriterion("near_hot_inf >", value, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("near_hot_inf >=", value, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfLessThan(BigDecimal value) {
            addCriterion("near_hot_inf <", value, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("near_hot_inf <=", value, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfIn(List<BigDecimal> values) {
            addCriterion("near_hot_inf in", values, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfNotIn(List<BigDecimal> values) {
            addCriterion("near_hot_inf not in", values, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("near_hot_inf between", value1, value2, "nearHotInf");
            return (Criteria) this;
        }

        public Criteria andNearHotInfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("near_hot_inf not between", value1, value2, "nearHotInf");
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