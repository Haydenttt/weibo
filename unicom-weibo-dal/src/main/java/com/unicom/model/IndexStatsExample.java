package com.unicom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexStatsExample() {
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

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
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

        public Criteria andRankTimeIsNull() {
            addCriterion("rank_time is null");
            return (Criteria) this;
        }

        public Criteria andRankTimeIsNotNull() {
            addCriterion("rank_time is not null");
            return (Criteria) this;
        }

        public Criteria andRankTimeEqualTo(String value) {
            addCriterion("rank_time =", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotEqualTo(String value) {
            addCriterion("rank_time <>", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeGreaterThan(String value) {
            addCriterion("rank_time >", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rank_time >=", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeLessThan(String value) {
            addCriterion("rank_time <", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeLessThanOrEqualTo(String value) {
            addCriterion("rank_time <=", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeLike(String value) {
            addCriterion("rank_time like", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotLike(String value) {
            addCriterion("rank_time not like", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeIn(List<String> values) {
            addCriterion("rank_time in", values, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotIn(List<String> values) {
            addCriterion("rank_time not in", values, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeBetween(String value1, String value2) {
            addCriterion("rank_time between", value1, value2, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotBetween(String value1, String value2) {
            addCriterion("rank_time not between", value1, value2, "rankTime");
            return (Criteria) this;
        }

        public Criteria andSumHeatIsNull() {
            addCriterion("sum_heat is null");
            return (Criteria) this;
        }

        public Criteria andSumHeatIsNotNull() {
            addCriterion("sum_heat is not null");
            return (Criteria) this;
        }

        public Criteria andSumHeatEqualTo(Integer value) {
            addCriterion("sum_heat =", value, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatNotEqualTo(Integer value) {
            addCriterion("sum_heat <>", value, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatGreaterThan(Integer value) {
            addCriterion("sum_heat >", value, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_heat >=", value, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatLessThan(Integer value) {
            addCriterion("sum_heat <", value, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatLessThanOrEqualTo(Integer value) {
            addCriterion("sum_heat <=", value, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatIn(List<Integer> values) {
            addCriterion("sum_heat in", values, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatNotIn(List<Integer> values) {
            addCriterion("sum_heat not in", values, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatBetween(Integer value1, Integer value2) {
            addCriterion("sum_heat between", value1, value2, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andSumHeatNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_heat not between", value1, value2, "sumHeat");
            return (Criteria) this;
        }

        public Criteria andHeatExponentIsNull() {
            addCriterion("heat_exponent is null");
            return (Criteria) this;
        }

        public Criteria andHeatExponentIsNotNull() {
            addCriterion("heat_exponent is not null");
            return (Criteria) this;
        }

        public Criteria andHeatExponentEqualTo(Integer value) {
            addCriterion("heat_exponent =", value, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentNotEqualTo(Integer value) {
            addCriterion("heat_exponent <>", value, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentGreaterThan(Integer value) {
            addCriterion("heat_exponent >", value, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("heat_exponent >=", value, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentLessThan(Integer value) {
            addCriterion("heat_exponent <", value, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentLessThanOrEqualTo(Integer value) {
            addCriterion("heat_exponent <=", value, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentIn(List<Integer> values) {
            addCriterion("heat_exponent in", values, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentNotIn(List<Integer> values) {
            addCriterion("heat_exponent not in", values, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentBetween(Integer value1, Integer value2) {
            addCriterion("heat_exponent between", value1, value2, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andHeatExponentNotBetween(Integer value1, Integer value2) {
            addCriterion("heat_exponent not between", value1, value2, "heatExponent");
            return (Criteria) this;
        }

        public Criteria andProIsNull() {
            addCriterion("pro is null");
            return (Criteria) this;
        }

        public Criteria andProIsNotNull() {
            addCriterion("pro is not null");
            return (Criteria) this;
        }

        public Criteria andProEqualTo(BigDecimal value) {
            addCriterion("pro =", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotEqualTo(BigDecimal value) {
            addCriterion("pro <>", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProGreaterThan(BigDecimal value) {
            addCriterion("pro >", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pro >=", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLessThan(BigDecimal value) {
            addCriterion("pro <", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pro <=", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProIn(List<BigDecimal> values) {
            addCriterion("pro in", values, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotIn(List<BigDecimal> values) {
            addCriterion("pro not in", values, "pro");
            return (Criteria) this;
        }

        public Criteria andProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pro between", value1, value2, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pro not between", value1, value2, "pro");
            return (Criteria) this;
        }

        public Criteria andCurrentRankIsNull() {
            addCriterion("current_rank is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRankIsNotNull() {
            addCriterion("current_rank is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRankEqualTo(Integer value) {
            addCriterion("current_rank =", value, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankNotEqualTo(Integer value) {
            addCriterion("current_rank <>", value, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankGreaterThan(Integer value) {
            addCriterion("current_rank >", value, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_rank >=", value, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankLessThan(Integer value) {
            addCriterion("current_rank <", value, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankLessThanOrEqualTo(Integer value) {
            addCriterion("current_rank <=", value, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankIn(List<Integer> values) {
            addCriterion("current_rank in", values, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankNotIn(List<Integer> values) {
            addCriterion("current_rank not in", values, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankBetween(Integer value1, Integer value2) {
            addCriterion("current_rank between", value1, value2, "currentRank");
            return (Criteria) this;
        }

        public Criteria andCurrentRankNotBetween(Integer value1, Integer value2) {
            addCriterion("current_rank not between", value1, value2, "currentRank");
            return (Criteria) this;
        }

        public Criteria andLastRankIsNull() {
            addCriterion("last_rank is null");
            return (Criteria) this;
        }

        public Criteria andLastRankIsNotNull() {
            addCriterion("last_rank is not null");
            return (Criteria) this;
        }

        public Criteria andLastRankEqualTo(Integer value) {
            addCriterion("last_rank =", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotEqualTo(Integer value) {
            addCriterion("last_rank <>", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankGreaterThan(Integer value) {
            addCriterion("last_rank >", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_rank >=", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankLessThan(Integer value) {
            addCriterion("last_rank <", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankLessThanOrEqualTo(Integer value) {
            addCriterion("last_rank <=", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankIn(List<Integer> values) {
            addCriterion("last_rank in", values, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotIn(List<Integer> values) {
            addCriterion("last_rank not in", values, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankBetween(Integer value1, Integer value2) {
            addCriterion("last_rank between", value1, value2, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotBetween(Integer value1, Integer value2) {
            addCriterion("last_rank not between", value1, value2, "lastRank");
            return (Criteria) this;
        }

        public Criteria andIsDayIsNull() {
            addCriterion("is_day is null");
            return (Criteria) this;
        }

        public Criteria andIsDayIsNotNull() {
            addCriterion("is_day is not null");
            return (Criteria) this;
        }

        public Criteria andIsDayEqualTo(Byte value) {
            addCriterion("is_day =", value, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayNotEqualTo(Byte value) {
            addCriterion("is_day <>", value, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayGreaterThan(Byte value) {
            addCriterion("is_day >", value, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_day >=", value, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayLessThan(Byte value) {
            addCriterion("is_day <", value, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayLessThanOrEqualTo(Byte value) {
            addCriterion("is_day <=", value, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayIn(List<Byte> values) {
            addCriterion("is_day in", values, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayNotIn(List<Byte> values) {
            addCriterion("is_day not in", values, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayBetween(Byte value1, Byte value2) {
            addCriterion("is_day between", value1, value2, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsDayNotBetween(Byte value1, Byte value2) {
            addCriterion("is_day not between", value1, value2, "isDay");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Byte value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Byte value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Byte value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Byte value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Byte value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Byte> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Byte> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Byte value1, Byte value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Byte value1, Byte value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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