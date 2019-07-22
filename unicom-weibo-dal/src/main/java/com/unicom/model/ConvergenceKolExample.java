package com.unicom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvergenceKolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConvergenceKolExample() {
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

        public Criteria andKolIdIsNull() {
            addCriterion("kol_id is null");
            return (Criteria) this;
        }

        public Criteria andKolIdIsNotNull() {
            addCriterion("kol_id is not null");
            return (Criteria) this;
        }

        public Criteria andKolIdEqualTo(Integer value) {
            addCriterion("kol_id =", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotEqualTo(Integer value) {
            addCriterion("kol_id <>", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdGreaterThan(Integer value) {
            addCriterion("kol_id >", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kol_id >=", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLessThan(Integer value) {
            addCriterion("kol_id <", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLessThanOrEqualTo(Integer value) {
            addCriterion("kol_id <=", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdIn(List<Integer> values) {
            addCriterion("kol_id in", values, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotIn(List<Integer> values) {
            addCriterion("kol_id not in", values, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdBetween(Integer value1, Integer value2) {
            addCriterion("kol_id between", value1, value2, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kol_id not between", value1, value2, "kolId");
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

        public Criteria andFansIsNull() {
            addCriterion("fans is null");
            return (Criteria) this;
        }

        public Criteria andFansIsNotNull() {
            addCriterion("fans is not null");
            return (Criteria) this;
        }

        public Criteria andFansEqualTo(Integer value) {
            addCriterion("fans =", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotEqualTo(Integer value) {
            addCriterion("fans <>", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThan(Integer value) {
            addCriterion("fans >", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans >=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThan(Integer value) {
            addCriterion("fans <", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansLessThanOrEqualTo(Integer value) {
            addCriterion("fans <=", value, "fans");
            return (Criteria) this;
        }

        public Criteria andFansIn(List<Integer> values) {
            addCriterion("fans in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotIn(List<Integer> values) {
            addCriterion("fans not in", values, "fans");
            return (Criteria) this;
        }

        public Criteria andFansBetween(Integer value1, Integer value2) {
            addCriterion("fans between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andFansNotBetween(Integer value1, Integer value2) {
            addCriterion("fans not between", value1, value2, "fans");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andWeboTextIsNull() {
            addCriterion("webo_text is null");
            return (Criteria) this;
        }

        public Criteria andWeboTextIsNotNull() {
            addCriterion("webo_text is not null");
            return (Criteria) this;
        }

        public Criteria andWeboTextEqualTo(String value) {
            addCriterion("webo_text =", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextNotEqualTo(String value) {
            addCriterion("webo_text <>", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextGreaterThan(String value) {
            addCriterion("webo_text >", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextGreaterThanOrEqualTo(String value) {
            addCriterion("webo_text >=", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextLessThan(String value) {
            addCriterion("webo_text <", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextLessThanOrEqualTo(String value) {
            addCriterion("webo_text <=", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextLike(String value) {
            addCriterion("webo_text like", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextNotLike(String value) {
            addCriterion("webo_text not like", value, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextIn(List<String> values) {
            addCriterion("webo_text in", values, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextNotIn(List<String> values) {
            addCriterion("webo_text not in", values, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextBetween(String value1, String value2) {
            addCriterion("webo_text between", value1, value2, "weboText");
            return (Criteria) this;
        }

        public Criteria andWeboTextNotBetween(String value1, String value2) {
            addCriterion("webo_text not between", value1, value2, "weboText");
            return (Criteria) this;
        }

        public Criteria andIfForwardIsNull() {
            addCriterion("if_forward is null");
            return (Criteria) this;
        }

        public Criteria andIfForwardIsNotNull() {
            addCriterion("if_forward is not null");
            return (Criteria) this;
        }

        public Criteria andIfForwardEqualTo(Byte value) {
            addCriterion("if_forward =", value, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardNotEqualTo(Byte value) {
            addCriterion("if_forward <>", value, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardGreaterThan(Byte value) {
            addCriterion("if_forward >", value, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_forward >=", value, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardLessThan(Byte value) {
            addCriterion("if_forward <", value, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardLessThanOrEqualTo(Byte value) {
            addCriterion("if_forward <=", value, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardIn(List<Byte> values) {
            addCriterion("if_forward in", values, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardNotIn(List<Byte> values) {
            addCriterion("if_forward not in", values, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardBetween(Byte value1, Byte value2) {
            addCriterion("if_forward between", value1, value2, "ifForward");
            return (Criteria) this;
        }

        public Criteria andIfForwardNotBetween(Byte value1, Byte value2) {
            addCriterion("if_forward not between", value1, value2, "ifForward");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeIsNull() {
            addCriterion("weibo_time is null");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeIsNotNull() {
            addCriterion("weibo_time is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeEqualTo(String value) {
            addCriterion("weibo_time =", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeNotEqualTo(String value) {
            addCriterion("weibo_time <>", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeGreaterThan(String value) {
            addCriterion("weibo_time >", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_time >=", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeLessThan(String value) {
            addCriterion("weibo_time <", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeLessThanOrEqualTo(String value) {
            addCriterion("weibo_time <=", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeLike(String value) {
            addCriterion("weibo_time like", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeNotLike(String value) {
            addCriterion("weibo_time not like", value, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeIn(List<String> values) {
            addCriterion("weibo_time in", values, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeNotIn(List<String> values) {
            addCriterion("weibo_time not in", values, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeBetween(String value1, String value2) {
            addCriterion("weibo_time between", value1, value2, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andWeiboTimeNotBetween(String value1, String value2) {
            addCriterion("weibo_time not between", value1, value2, "weiboTime");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andRootWeiboIsNull() {
            addCriterion("root_weibo is null");
            return (Criteria) this;
        }

        public Criteria andRootWeiboIsNotNull() {
            addCriterion("root_weibo is not null");
            return (Criteria) this;
        }

        public Criteria andRootWeiboEqualTo(String value) {
            addCriterion("root_weibo =", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboNotEqualTo(String value) {
            addCriterion("root_weibo <>", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboGreaterThan(String value) {
            addCriterion("root_weibo >", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("root_weibo >=", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboLessThan(String value) {
            addCriterion("root_weibo <", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboLessThanOrEqualTo(String value) {
            addCriterion("root_weibo <=", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboLike(String value) {
            addCriterion("root_weibo like", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboNotLike(String value) {
            addCriterion("root_weibo not like", value, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboIn(List<String> values) {
            addCriterion("root_weibo in", values, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboNotIn(List<String> values) {
            addCriterion("root_weibo not in", values, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboBetween(String value1, String value2) {
            addCriterion("root_weibo between", value1, value2, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andRootWeiboNotBetween(String value1, String value2) {
            addCriterion("root_weibo not between", value1, value2, "rootWeibo");
            return (Criteria) this;
        }

        public Criteria andVTypeIsNull() {
            addCriterion("v_type is null");
            return (Criteria) this;
        }

        public Criteria andVTypeIsNotNull() {
            addCriterion("v_type is not null");
            return (Criteria) this;
        }

        public Criteria andVTypeEqualTo(Byte value) {
            addCriterion("v_type =", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotEqualTo(Byte value) {
            addCriterion("v_type <>", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeGreaterThan(Byte value) {
            addCriterion("v_type >", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("v_type >=", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeLessThan(Byte value) {
            addCriterion("v_type <", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeLessThanOrEqualTo(Byte value) {
            addCriterion("v_type <=", value, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeIn(List<Byte> values) {
            addCriterion("v_type in", values, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotIn(List<Byte> values) {
            addCriterion("v_type not in", values, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeBetween(Byte value1, Byte value2) {
            addCriterion("v_type between", value1, value2, "vType");
            return (Criteria) this;
        }

        public Criteria andVTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("v_type not between", value1, value2, "vType");
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