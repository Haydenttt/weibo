package com.unicom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventStatsExample() {
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

        public Criteria andEffectInfIsNull() {
            addCriterion("effect_inf is null");
            return (Criteria) this;
        }

        public Criteria andEffectInfIsNotNull() {
            addCriterion("effect_inf is not null");
            return (Criteria) this;
        }

        public Criteria andEffectInfEqualTo(BigDecimal value) {
            addCriterion("effect_inf =", value, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfNotEqualTo(BigDecimal value) {
            addCriterion("effect_inf <>", value, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfGreaterThan(BigDecimal value) {
            addCriterion("effect_inf >", value, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_inf >=", value, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfLessThan(BigDecimal value) {
            addCriterion("effect_inf <", value, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_inf <=", value, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfIn(List<BigDecimal> values) {
            addCriterion("effect_inf in", values, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfNotIn(List<BigDecimal> values) {
            addCriterion("effect_inf not in", values, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_inf between", value1, value2, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectInfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_inf not between", value1, value2, "effectInf");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProIsNull() {
            addCriterion("effect_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProIsNotNull() {
            addCriterion("effect_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProEqualTo(BigDecimal value) {
            addCriterion("effect_type_pro =", value, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProNotEqualTo(BigDecimal value) {
            addCriterion("effect_type_pro <>", value, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProGreaterThan(BigDecimal value) {
            addCriterion("effect_type_pro >", value, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_type_pro >=", value, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProLessThan(BigDecimal value) {
            addCriterion("effect_type_pro <", value, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_type_pro <=", value, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProIn(List<BigDecimal> values) {
            addCriterion("effect_type_pro in", values, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProNotIn(List<BigDecimal> values) {
            addCriterion("effect_type_pro not in", values, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_type_pro between", value1, value2, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_type_pro not between", value1, value2, "effectTypePro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProIsNull() {
            addCriterion("effect_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andEffectAllProIsNotNull() {
            addCriterion("effect_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andEffectAllProEqualTo(BigDecimal value) {
            addCriterion("effect_all_pro =", value, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProNotEqualTo(BigDecimal value) {
            addCriterion("effect_all_pro <>", value, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProGreaterThan(BigDecimal value) {
            addCriterion("effect_all_pro >", value, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_all_pro >=", value, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProLessThan(BigDecimal value) {
            addCriterion("effect_all_pro <", value, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_all_pro <=", value, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProIn(List<BigDecimal> values) {
            addCriterion("effect_all_pro in", values, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProNotIn(List<BigDecimal> values) {
            addCriterion("effect_all_pro not in", values, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_all_pro between", value1, value2, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_all_pro not between", value1, value2, "effectAllPro");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgIsNull() {
            addCriterion("effect_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgIsNotNull() {
            addCriterion("effect_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgEqualTo(BigDecimal value) {
            addCriterion("effect_class_avg =", value, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("effect_class_avg <>", value, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgGreaterThan(BigDecimal value) {
            addCriterion("effect_class_avg >", value, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_class_avg >=", value, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgLessThan(BigDecimal value) {
            addCriterion("effect_class_avg <", value, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_class_avg <=", value, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgIn(List<BigDecimal> values) {
            addCriterion("effect_class_avg in", values, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("effect_class_avg not in", values, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_class_avg between", value1, value2, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andEffectClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_class_avg not between", value1, value2, "effectClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboInfIsNull() {
            addCriterion("weibo_inf is null");
            return (Criteria) this;
        }

        public Criteria andWeiboInfIsNotNull() {
            addCriterion("weibo_inf is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboInfEqualTo(BigDecimal value) {
            addCriterion("weibo_inf =", value, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfNotEqualTo(BigDecimal value) {
            addCriterion("weibo_inf <>", value, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfGreaterThan(BigDecimal value) {
            addCriterion("weibo_inf >", value, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_inf >=", value, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfLessThan(BigDecimal value) {
            addCriterion("weibo_inf <", value, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_inf <=", value, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfIn(List<BigDecimal> values) {
            addCriterion("weibo_inf in", values, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfNotIn(List<BigDecimal> values) {
            addCriterion("weibo_inf not in", values, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_inf between", value1, value2, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboInfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_inf not between", value1, value2, "weiboInf");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProIsNull() {
            addCriterion("weibo_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProIsNotNull() {
            addCriterion("weibo_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProEqualTo(BigDecimal value) {
            addCriterion("weibo_type_pro =", value, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProNotEqualTo(BigDecimal value) {
            addCriterion("weibo_type_pro <>", value, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProGreaterThan(BigDecimal value) {
            addCriterion("weibo_type_pro >", value, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_type_pro >=", value, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProLessThan(BigDecimal value) {
            addCriterion("weibo_type_pro <", value, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_type_pro <=", value, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProIn(List<BigDecimal> values) {
            addCriterion("weibo_type_pro in", values, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProNotIn(List<BigDecimal> values) {
            addCriterion("weibo_type_pro not in", values, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_type_pro between", value1, value2, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_type_pro not between", value1, value2, "weiboTypePro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProIsNull() {
            addCriterion("weibo_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProIsNotNull() {
            addCriterion("weibo_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProEqualTo(BigDecimal value) {
            addCriterion("weibo_all_pro =", value, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProNotEqualTo(BigDecimal value) {
            addCriterion("weibo_all_pro <>", value, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProGreaterThan(BigDecimal value) {
            addCriterion("weibo_all_pro >", value, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_all_pro >=", value, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProLessThan(BigDecimal value) {
            addCriterion("weibo_all_pro <", value, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_all_pro <=", value, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProIn(List<BigDecimal> values) {
            addCriterion("weibo_all_pro in", values, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProNotIn(List<BigDecimal> values) {
            addCriterion("weibo_all_pro not in", values, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_all_pro between", value1, value2, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_all_pro not between", value1, value2, "weiboAllPro");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgIsNull() {
            addCriterion("weibo_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgIsNotNull() {
            addCriterion("weibo_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgEqualTo(BigDecimal value) {
            addCriterion("weibo_class_avg =", value, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("weibo_class_avg <>", value, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgGreaterThan(BigDecimal value) {
            addCriterion("weibo_class_avg >", value, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_class_avg >=", value, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgLessThan(BigDecimal value) {
            addCriterion("weibo_class_avg <", value, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weibo_class_avg <=", value, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgIn(List<BigDecimal> values) {
            addCriterion("weibo_class_avg in", values, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("weibo_class_avg not in", values, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_class_avg between", value1, value2, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeiboClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weibo_class_avg not between", value1, value2, "weiboClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinInfIsNull() {
            addCriterion("weixin_inf is null");
            return (Criteria) this;
        }

        public Criteria andWeixinInfIsNotNull() {
            addCriterion("weixin_inf is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinInfEqualTo(BigDecimal value) {
            addCriterion("weixin_inf =", value, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfNotEqualTo(BigDecimal value) {
            addCriterion("weixin_inf <>", value, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfGreaterThan(BigDecimal value) {
            addCriterion("weixin_inf >", value, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_inf >=", value, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfLessThan(BigDecimal value) {
            addCriterion("weixin_inf <", value, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_inf <=", value, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfIn(List<BigDecimal> values) {
            addCriterion("weixin_inf in", values, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfNotIn(List<BigDecimal> values) {
            addCriterion("weixin_inf not in", values, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_inf between", value1, value2, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinInfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_inf not between", value1, value2, "weixinInf");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProIsNull() {
            addCriterion("weixin_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProIsNotNull() {
            addCriterion("weixin_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProEqualTo(BigDecimal value) {
            addCriterion("weixin_type_pro =", value, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProNotEqualTo(BigDecimal value) {
            addCriterion("weixin_type_pro <>", value, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProGreaterThan(BigDecimal value) {
            addCriterion("weixin_type_pro >", value, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_type_pro >=", value, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProLessThan(BigDecimal value) {
            addCriterion("weixin_type_pro <", value, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_type_pro <=", value, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProIn(List<BigDecimal> values) {
            addCriterion("weixin_type_pro in", values, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProNotIn(List<BigDecimal> values) {
            addCriterion("weixin_type_pro not in", values, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_type_pro between", value1, value2, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_type_pro not between", value1, value2, "weixinTypePro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProIsNull() {
            addCriterion("weixin_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProIsNotNull() {
            addCriterion("weixin_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProEqualTo(BigDecimal value) {
            addCriterion("weixin_all_pro =", value, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProNotEqualTo(BigDecimal value) {
            addCriterion("weixin_all_pro <>", value, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProGreaterThan(BigDecimal value) {
            addCriterion("weixin_all_pro >", value, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_all_pro >=", value, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProLessThan(BigDecimal value) {
            addCriterion("weixin_all_pro <", value, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_all_pro <=", value, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProIn(List<BigDecimal> values) {
            addCriterion("weixin_all_pro in", values, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProNotIn(List<BigDecimal> values) {
            addCriterion("weixin_all_pro not in", values, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_all_pro between", value1, value2, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_all_pro not between", value1, value2, "weixinAllPro");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgIsNull() {
            addCriterion("weixin_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgIsNotNull() {
            addCriterion("weixin_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgEqualTo(BigDecimal value) {
            addCriterion("weixin_class_avg =", value, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("weixin_class_avg <>", value, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgGreaterThan(BigDecimal value) {
            addCriterion("weixin_class_avg >", value, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_class_avg >=", value, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgLessThan(BigDecimal value) {
            addCriterion("weixin_class_avg <", value, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weixin_class_avg <=", value, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgIn(List<BigDecimal> values) {
            addCriterion("weixin_class_avg in", values, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("weixin_class_avg not in", values, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_class_avg between", value1, value2, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andWeixinClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weixin_class_avg not between", value1, value2, "weixinClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaInfIsNull() {
            addCriterion("media_inf is null");
            return (Criteria) this;
        }

        public Criteria andMediaInfIsNotNull() {
            addCriterion("media_inf is not null");
            return (Criteria) this;
        }

        public Criteria andMediaInfEqualTo(BigDecimal value) {
            addCriterion("media_inf =", value, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfNotEqualTo(BigDecimal value) {
            addCriterion("media_inf <>", value, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfGreaterThan(BigDecimal value) {
            addCriterion("media_inf >", value, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("media_inf >=", value, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfLessThan(BigDecimal value) {
            addCriterion("media_inf <", value, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("media_inf <=", value, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfIn(List<BigDecimal> values) {
            addCriterion("media_inf in", values, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfNotIn(List<BigDecimal> values) {
            addCriterion("media_inf not in", values, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_inf between", value1, value2, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaInfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_inf not between", value1, value2, "mediaInf");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProIsNull() {
            addCriterion("media_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProIsNotNull() {
            addCriterion("media_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProEqualTo(BigDecimal value) {
            addCriterion("media_type_pro =", value, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProNotEqualTo(BigDecimal value) {
            addCriterion("media_type_pro <>", value, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProGreaterThan(BigDecimal value) {
            addCriterion("media_type_pro >", value, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("media_type_pro >=", value, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProLessThan(BigDecimal value) {
            addCriterion("media_type_pro <", value, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("media_type_pro <=", value, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProIn(List<BigDecimal> values) {
            addCriterion("media_type_pro in", values, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProNotIn(List<BigDecimal> values) {
            addCriterion("media_type_pro not in", values, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_type_pro between", value1, value2, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_type_pro not between", value1, value2, "mediaTypePro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProIsNull() {
            addCriterion("media_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andMediaAllProIsNotNull() {
            addCriterion("media_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andMediaAllProEqualTo(BigDecimal value) {
            addCriterion("media_all_pro =", value, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProNotEqualTo(BigDecimal value) {
            addCriterion("media_all_pro <>", value, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProGreaterThan(BigDecimal value) {
            addCriterion("media_all_pro >", value, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("media_all_pro >=", value, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProLessThan(BigDecimal value) {
            addCriterion("media_all_pro <", value, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("media_all_pro <=", value, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProIn(List<BigDecimal> values) {
            addCriterion("media_all_pro in", values, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProNotIn(List<BigDecimal> values) {
            addCriterion("media_all_pro not in", values, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_all_pro between", value1, value2, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_all_pro not between", value1, value2, "mediaAllPro");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgIsNull() {
            addCriterion("media_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgIsNotNull() {
            addCriterion("media_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgEqualTo(BigDecimal value) {
            addCriterion("media_class_avg =", value, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("media_class_avg <>", value, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgGreaterThan(BigDecimal value) {
            addCriterion("media_class_avg >", value, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("media_class_avg >=", value, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgLessThan(BigDecimal value) {
            addCriterion("media_class_avg <", value, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("media_class_avg <=", value, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgIn(List<BigDecimal> values) {
            addCriterion("media_class_avg in", values, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("media_class_avg not in", values, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_class_avg between", value1, value2, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("media_class_avg not between", value1, value2, "mediaClassAvg");
            return (Criteria) this;
        }

        public Criteria andMediaNumIsNull() {
            addCriterion("media_num is null");
            return (Criteria) this;
        }

        public Criteria andMediaNumIsNotNull() {
            addCriterion("media_num is not null");
            return (Criteria) this;
        }

        public Criteria andMediaNumEqualTo(Integer value) {
            addCriterion("media_num =", value, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumNotEqualTo(Integer value) {
            addCriterion("media_num <>", value, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumGreaterThan(Integer value) {
            addCriterion("media_num >", value, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_num >=", value, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumLessThan(Integer value) {
            addCriterion("media_num <", value, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumLessThanOrEqualTo(Integer value) {
            addCriterion("media_num <=", value, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumIn(List<Integer> values) {
            addCriterion("media_num in", values, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumNotIn(List<Integer> values) {
            addCriterion("media_num not in", values, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumBetween(Integer value1, Integer value2) {
            addCriterion("media_num between", value1, value2, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andMediaNumNotBetween(Integer value1, Integer value2) {
            addCriterion("media_num not between", value1, value2, "mediaNum");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInIsNull() {
            addCriterion("ccp_media_in is null");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInIsNotNull() {
            addCriterion("ccp_media_in is not null");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInEqualTo(BigDecimal value) {
            addCriterion("ccp_media_in =", value, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInNotEqualTo(BigDecimal value) {
            addCriterion("ccp_media_in <>", value, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInGreaterThan(BigDecimal value) {
            addCriterion("ccp_media_in >", value, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_media_in >=", value, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInLessThan(BigDecimal value) {
            addCriterion("ccp_media_in <", value, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_media_in <=", value, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInIn(List<BigDecimal> values) {
            addCriterion("ccp_media_in in", values, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInNotIn(List<BigDecimal> values) {
            addCriterion("ccp_media_in not in", values, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_media_in between", value1, value2, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpMediaInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_media_in not between", value1, value2, "ccpMediaIn");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProIsNull() {
            addCriterion("ccp_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProIsNotNull() {
            addCriterion("ccp_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProEqualTo(BigDecimal value) {
            addCriterion("ccp_type_pro =", value, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProNotEqualTo(BigDecimal value) {
            addCriterion("ccp_type_pro <>", value, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProGreaterThan(BigDecimal value) {
            addCriterion("ccp_type_pro >", value, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_type_pro >=", value, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProLessThan(BigDecimal value) {
            addCriterion("ccp_type_pro <", value, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_type_pro <=", value, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProIn(List<BigDecimal> values) {
            addCriterion("ccp_type_pro in", values, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProNotIn(List<BigDecimal> values) {
            addCriterion("ccp_type_pro not in", values, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_type_pro between", value1, value2, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_type_pro not between", value1, value2, "ccpTypePro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProIsNull() {
            addCriterion("ccp_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andCcpAllProIsNotNull() {
            addCriterion("ccp_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andCcpAllProEqualTo(BigDecimal value) {
            addCriterion("ccp_all_pro =", value, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProNotEqualTo(BigDecimal value) {
            addCriterion("ccp_all_pro <>", value, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProGreaterThan(BigDecimal value) {
            addCriterion("ccp_all_pro >", value, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_all_pro >=", value, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProLessThan(BigDecimal value) {
            addCriterion("ccp_all_pro <", value, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_all_pro <=", value, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProIn(List<BigDecimal> values) {
            addCriterion("ccp_all_pro in", values, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProNotIn(List<BigDecimal> values) {
            addCriterion("ccp_all_pro not in", values, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_all_pro between", value1, value2, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_all_pro not between", value1, value2, "ccpAllPro");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgIsNull() {
            addCriterion("ccp_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgIsNotNull() {
            addCriterion("ccp_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgEqualTo(BigDecimal value) {
            addCriterion("ccp_class_avg =", value, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("ccp_class_avg <>", value, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgGreaterThan(BigDecimal value) {
            addCriterion("ccp_class_avg >", value, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_class_avg >=", value, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgLessThan(BigDecimal value) {
            addCriterion("ccp_class_avg <", value, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ccp_class_avg <=", value, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgIn(List<BigDecimal> values) {
            addCriterion("ccp_class_avg in", values, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("ccp_class_avg not in", values, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_class_avg between", value1, value2, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andCcpClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ccp_class_avg not between", value1, value2, "ccpClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInIsNull() {
            addCriterion("finance_media_in is null");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInIsNotNull() {
            addCriterion("finance_media_in is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInEqualTo(BigDecimal value) {
            addCriterion("finance_media_in =", value, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInNotEqualTo(BigDecimal value) {
            addCriterion("finance_media_in <>", value, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInGreaterThan(BigDecimal value) {
            addCriterion("finance_media_in >", value, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_media_in >=", value, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInLessThan(BigDecimal value) {
            addCriterion("finance_media_in <", value, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_media_in <=", value, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInIn(List<BigDecimal> values) {
            addCriterion("finance_media_in in", values, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInNotIn(List<BigDecimal> values) {
            addCriterion("finance_media_in not in", values, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_media_in between", value1, value2, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceMediaInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_media_in not between", value1, value2, "financeMediaIn");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProIsNull() {
            addCriterion("finance_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProIsNotNull() {
            addCriterion("finance_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProEqualTo(BigDecimal value) {
            addCriterion("finance_type_pro =", value, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProNotEqualTo(BigDecimal value) {
            addCriterion("finance_type_pro <>", value, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProGreaterThan(BigDecimal value) {
            addCriterion("finance_type_pro >", value, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_type_pro >=", value, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProLessThan(BigDecimal value) {
            addCriterion("finance_type_pro <", value, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_type_pro <=", value, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProIn(List<BigDecimal> values) {
            addCriterion("finance_type_pro in", values, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProNotIn(List<BigDecimal> values) {
            addCriterion("finance_type_pro not in", values, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_type_pro between", value1, value2, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_type_pro not between", value1, value2, "financeTypePro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProIsNull() {
            addCriterion("finance_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProIsNotNull() {
            addCriterion("finance_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProEqualTo(BigDecimal value) {
            addCriterion("finance_all_pro =", value, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProNotEqualTo(BigDecimal value) {
            addCriterion("finance_all_pro <>", value, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProGreaterThan(BigDecimal value) {
            addCriterion("finance_all_pro >", value, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_all_pro >=", value, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProLessThan(BigDecimal value) {
            addCriterion("finance_all_pro <", value, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_all_pro <=", value, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProIn(List<BigDecimal> values) {
            addCriterion("finance_all_pro in", values, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProNotIn(List<BigDecimal> values) {
            addCriterion("finance_all_pro not in", values, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_all_pro between", value1, value2, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_all_pro not between", value1, value2, "financeAllPro");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgIsNull() {
            addCriterion("finance_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgIsNotNull() {
            addCriterion("finance_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgEqualTo(BigDecimal value) {
            addCriterion("finance_class_avg =", value, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("finance_class_avg <>", value, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgGreaterThan(BigDecimal value) {
            addCriterion("finance_class_avg >", value, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_class_avg >=", value, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgLessThan(BigDecimal value) {
            addCriterion("finance_class_avg <", value, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_class_avg <=", value, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgIn(List<BigDecimal> values) {
            addCriterion("finance_class_avg in", values, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("finance_class_avg not in", values, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_class_avg between", value1, value2, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andFinanceClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_class_avg not between", value1, value2, "financeClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechMediaInIsNull() {
            addCriterion("tech_media_in is null");
            return (Criteria) this;
        }

        public Criteria andTechMediaInIsNotNull() {
            addCriterion("tech_media_in is not null");
            return (Criteria) this;
        }

        public Criteria andTechMediaInEqualTo(BigDecimal value) {
            addCriterion("tech_media_in =", value, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInNotEqualTo(BigDecimal value) {
            addCriterion("tech_media_in <>", value, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInGreaterThan(BigDecimal value) {
            addCriterion("tech_media_in >", value, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_media_in >=", value, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInLessThan(BigDecimal value) {
            addCriterion("tech_media_in <", value, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_media_in <=", value, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInIn(List<BigDecimal> values) {
            addCriterion("tech_media_in in", values, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInNotIn(List<BigDecimal> values) {
            addCriterion("tech_media_in not in", values, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_media_in between", value1, value2, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechMediaInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_media_in not between", value1, value2, "techMediaIn");
            return (Criteria) this;
        }

        public Criteria andTechTypeProIsNull() {
            addCriterion("tech_type_pro is null");
            return (Criteria) this;
        }

        public Criteria andTechTypeProIsNotNull() {
            addCriterion("tech_type_pro is not null");
            return (Criteria) this;
        }

        public Criteria andTechTypeProEqualTo(BigDecimal value) {
            addCriterion("tech_type_pro =", value, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProNotEqualTo(BigDecimal value) {
            addCriterion("tech_type_pro <>", value, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProGreaterThan(BigDecimal value) {
            addCriterion("tech_type_pro >", value, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_type_pro >=", value, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProLessThan(BigDecimal value) {
            addCriterion("tech_type_pro <", value, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_type_pro <=", value, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProIn(List<BigDecimal> values) {
            addCriterion("tech_type_pro in", values, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProNotIn(List<BigDecimal> values) {
            addCriterion("tech_type_pro not in", values, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_type_pro between", value1, value2, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechTypeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_type_pro not between", value1, value2, "techTypePro");
            return (Criteria) this;
        }

        public Criteria andTechAllProIsNull() {
            addCriterion("tech_all_pro is null");
            return (Criteria) this;
        }

        public Criteria andTechAllProIsNotNull() {
            addCriterion("tech_all_pro is not null");
            return (Criteria) this;
        }

        public Criteria andTechAllProEqualTo(BigDecimal value) {
            addCriterion("tech_all_pro =", value, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProNotEqualTo(BigDecimal value) {
            addCriterion("tech_all_pro <>", value, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProGreaterThan(BigDecimal value) {
            addCriterion("tech_all_pro >", value, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_all_pro >=", value, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProLessThan(BigDecimal value) {
            addCriterion("tech_all_pro <", value, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_all_pro <=", value, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProIn(List<BigDecimal> values) {
            addCriterion("tech_all_pro in", values, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProNotIn(List<BigDecimal> values) {
            addCriterion("tech_all_pro not in", values, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_all_pro between", value1, value2, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechAllProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_all_pro not between", value1, value2, "techAllPro");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgIsNull() {
            addCriterion("tech_class_avg is null");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgIsNotNull() {
            addCriterion("tech_class_avg is not null");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgEqualTo(BigDecimal value) {
            addCriterion("tech_class_avg =", value, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgNotEqualTo(BigDecimal value) {
            addCriterion("tech_class_avg <>", value, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgGreaterThan(BigDecimal value) {
            addCriterion("tech_class_avg >", value, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_class_avg >=", value, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgLessThan(BigDecimal value) {
            addCriterion("tech_class_avg <", value, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tech_class_avg <=", value, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgIn(List<BigDecimal> values) {
            addCriterion("tech_class_avg in", values, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgNotIn(List<BigDecimal> values) {
            addCriterion("tech_class_avg not in", values, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_class_avg between", value1, value2, "techClassAvg");
            return (Criteria) this;
        }

        public Criteria andTechClassAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tech_class_avg not between", value1, value2, "techClassAvg");
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