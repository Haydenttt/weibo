package com.unicom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexMonthEventDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexMonthEventDetailExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFirstTypeIsNull() {
            addCriterion("first_type is null");
            return (Criteria) this;
        }

        public Criteria andFirstTypeIsNotNull() {
            addCriterion("first_type is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTypeEqualTo(String value) {
            addCriterion("first_type =", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotEqualTo(String value) {
            addCriterion("first_type <>", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeGreaterThan(String value) {
            addCriterion("first_type >", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("first_type >=", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeLessThan(String value) {
            addCriterion("first_type <", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeLessThanOrEqualTo(String value) {
            addCriterion("first_type <=", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeLike(String value) {
            addCriterion("first_type like", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotLike(String value) {
            addCriterion("first_type not like", value, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeIn(List<String> values) {
            addCriterion("first_type in", values, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotIn(List<String> values) {
            addCriterion("first_type not in", values, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeBetween(String value1, String value2) {
            addCriterion("first_type between", value1, value2, "firstType");
            return (Criteria) this;
        }

        public Criteria andFirstTypeNotBetween(String value1, String value2) {
            addCriterion("first_type not between", value1, value2, "firstType");
            return (Criteria) this;
        }

        public Criteria andInfIsNull() {
            addCriterion("inf is null");
            return (Criteria) this;
        }

        public Criteria andInfIsNotNull() {
            addCriterion("inf is not null");
            return (Criteria) this;
        }

        public Criteria andInfEqualTo(BigDecimal value) {
            addCriterion("inf =", value, "inf");
            return (Criteria) this;
        }

        public Criteria andInfNotEqualTo(BigDecimal value) {
            addCriterion("inf <>", value, "inf");
            return (Criteria) this;
        }

        public Criteria andInfGreaterThan(BigDecimal value) {
            addCriterion("inf >", value, "inf");
            return (Criteria) this;
        }

        public Criteria andInfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inf >=", value, "inf");
            return (Criteria) this;
        }

        public Criteria andInfLessThan(BigDecimal value) {
            addCriterion("inf <", value, "inf");
            return (Criteria) this;
        }

        public Criteria andInfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inf <=", value, "inf");
            return (Criteria) this;
        }

        public Criteria andInfIn(List<BigDecimal> values) {
            addCriterion("inf in", values, "inf");
            return (Criteria) this;
        }

        public Criteria andInfNotIn(List<BigDecimal> values) {
            addCriterion("inf not in", values, "inf");
            return (Criteria) this;
        }

        public Criteria andInfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inf between", value1, value2, "inf");
            return (Criteria) this;
        }

        public Criteria andInfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inf not between", value1, value2, "inf");
            return (Criteria) this;
        }

        public Criteria andTypeProIsNull() {
            addCriterion("type_pro is null");
            return (Criteria) this;
        }

        public Criteria andTypeProIsNotNull() {
            addCriterion("type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andTypeProEqualTo(BigDecimal value) {
            addCriterion("type_pro =", value, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProNotEqualTo(BigDecimal value) {
            addCriterion("type_pro <>", value, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProGreaterThan(BigDecimal value) {
            addCriterion("type_pro >", value, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_pro >=", value, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProLessThan(BigDecimal value) {
            addCriterion("type_pro <", value, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_pro <=", value, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProIn(List<BigDecimal> values) {
            addCriterion("type_pro in", values, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProNotIn(List<BigDecimal> values) {
            addCriterion("type_pro not in", values, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_pro between", value1, value2, "typePro");
            return (Criteria) this;
        }

        public Criteria andTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_pro not between", value1, value2, "typePro");
            return (Criteria) this;
        }

        public Criteria andAllProIsNull() {
            addCriterion("all_pro is null");
            return (Criteria) this;
        }

        public Criteria andAllProIsNotNull() {
            addCriterion("all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andAllProEqualTo(BigDecimal value) {
            addCriterion("all_pro =", value, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProNotEqualTo(BigDecimal value) {
            addCriterion("all_pro <>", value, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProGreaterThan(BigDecimal value) {
            addCriterion("all_pro >", value, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_pro >=", value, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProLessThan(BigDecimal value) {
            addCriterion("all_pro <", value, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_pro <=", value, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProIn(List<BigDecimal> values) {
            addCriterion("all_pro in", values, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProNotIn(List<BigDecimal> values) {
            addCriterion("all_pro not in", values, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_pro between", value1, value2, "allPro");
            return (Criteria) this;
        }

        public Criteria andAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_pro not between", value1, value2, "allPro");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfIsNull() {
            addCriterion("seven_day_inf is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfIsNotNull() {
            addCriterion("seven_day_inf is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfEqualTo(Integer value) {
            addCriterion("seven_day_inf =", value, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfNotEqualTo(Integer value) {
            addCriterion("seven_day_inf <>", value, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfGreaterThan(Integer value) {
            addCriterion("seven_day_inf >", value, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfGreaterThanOrEqualTo(Integer value) {
            addCriterion("seven_day_inf >=", value, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfLessThan(Integer value) {
            addCriterion("seven_day_inf <", value, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfLessThanOrEqualTo(Integer value) {
            addCriterion("seven_day_inf <=", value, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfIn(List<Integer> values) {
            addCriterion("seven_day_inf in", values, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfNotIn(List<Integer> values) {
            addCriterion("seven_day_inf not in", values, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfBetween(Integer value1, Integer value2) {
            addCriterion("seven_day_inf between", value1, value2, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayInfNotBetween(Integer value1, Integer value2) {
            addCriterion("seven_day_inf not between", value1, value2, "sevenDayInf");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeIsNull() {
            addCriterion("seven_day_time is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeIsNotNull() {
            addCriterion("seven_day_time is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeEqualTo(String value) {
            addCriterion("seven_day_time =", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeNotEqualTo(String value) {
            addCriterion("seven_day_time <>", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeGreaterThan(String value) {
            addCriterion("seven_day_time >", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("seven_day_time >=", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeLessThan(String value) {
            addCriterion("seven_day_time <", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeLessThanOrEqualTo(String value) {
            addCriterion("seven_day_time <=", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeLike(String value) {
            addCriterion("seven_day_time like", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeNotLike(String value) {
            addCriterion("seven_day_time not like", value, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeIn(List<String> values) {
            addCriterion("seven_day_time in", values, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeNotIn(List<String> values) {
            addCriterion("seven_day_time not in", values, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeBetween(String value1, String value2) {
            addCriterion("seven_day_time between", value1, value2, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayTimeNotBetween(String value1, String value2) {
            addCriterion("seven_day_time not between", value1, value2, "sevenDayTime");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartIsNull() {
            addCriterion("seven_day_start is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartIsNotNull() {
            addCriterion("seven_day_start is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartEqualTo(String value) {
            addCriterion("seven_day_start =", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartNotEqualTo(String value) {
            addCriterion("seven_day_start <>", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartGreaterThan(String value) {
            addCriterion("seven_day_start >", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartGreaterThanOrEqualTo(String value) {
            addCriterion("seven_day_start >=", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartLessThan(String value) {
            addCriterion("seven_day_start <", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartLessThanOrEqualTo(String value) {
            addCriterion("seven_day_start <=", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartLike(String value) {
            addCriterion("seven_day_start like", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartNotLike(String value) {
            addCriterion("seven_day_start not like", value, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartIn(List<String> values) {
            addCriterion("seven_day_start in", values, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartNotIn(List<String> values) {
            addCriterion("seven_day_start not in", values, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartBetween(String value1, String value2) {
            addCriterion("seven_day_start between", value1, value2, "sevenDayStart");
            return (Criteria) this;
        }

        public Criteria andSevenDayStartNotBetween(String value1, String value2) {
            addCriterion("seven_day_start not between", value1, value2, "sevenDayStart");
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