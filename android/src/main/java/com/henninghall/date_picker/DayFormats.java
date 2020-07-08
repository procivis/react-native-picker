package com.henninghall.date_picker;

import java.util.HashMap;

public class DayFormats {

    public static String get(String locale){
        return map.get(locale);
    }

    private static HashMap<String, String> map = new HashMap<String, String>(){{
        put("af","EEE dd MMM");
        put("af_NA","EEE dd MMM");
        put("af_ZA","EEE dd MMM");
        put("agq","EEE d MMM");
        put("agq_CM","EEE d MMM");
        put("ak","EEE MMM dd");
        put("ak_GH","EEE MMM dd");
        put("am","MMM d EEE");
        put("am_ET","MMM d EEE");
        put("ar","EEE، d MMM");
        put("ar_001","EEE، d MMM");
        put("ar_AE","EEE، d MMM");
        put("ar_BH","EEE، d MMM");
        put("ar_DJ","EEE، d MMM");
        put("ar_DZ","EEE، d MMM");
        put("ar_EG","EEE، d MMM");
        put("ar_EH","EEE، d MMM");
        put("ar_ER","EEE، d MMM");
        put("ar_IL","EEE، d MMM");
        put("ar_IQ","EEE، d MMM");
        put("ar_JO","EEE، d MMM");
        put("ar_KM","EEE، d MMM");
        put("ar_KW","EEE، d MMM");
        put("ar_LB","EEE، d MMM");
        put("ar_LY","EEE، d MMM");
        put("ar_MA","EEE، d MMM");
        put("ar_MR","EEE، d MMM");
        put("ar_OM","EEE، d MMM");
        put("ar_PS","EEE، d MMM");
        put("ar_QA","EEE، d MMM");
        put("ar_SA","EEE، d MMM");
        put("ar_SD","EEE، d MMM");
        put("ar_SO","EEE، d MMM");
        put("ar_SS","EEE، d MMM");
        put("ar_SY","EEE، d MMM");
        put("ar_TD","EEE، d MMM");
        put("ar_TN","EEE، d MMM");
        put("ar_XB","EEE، d MMM");
        put("ar_YE","EEE، d MMM");
        put("as","EEE d MMM");
        put("as_IN","EEE d MMM");
        put("asa","EEE d MMM");
        put("asa_TZ","EEE d MMM");
        put("ast","EEE d MMM");
        put("ast_ES","EEE d MMM");
        put("az","d MMM EEE");
        put("az_Cyrl","d MMM EEE");
        put("az_Cyrl_AZ","d MMM EEE");
        put("az_Latn","d MMM EEE");
        put("az_Latn_AZ","d MMM EEE");
        put("bas","EEE d MMM");
        put("bas_CM","EEE d MMM");
        put("be","EEE d MMM");
        put("be_BY","EEE d MMM");
        put("bem","EEE d MMM");
        put("bem_ZM","EEE d MMM");
        put("bez","EEE d MMM");
        put("bez_TZ","EEE d MMM");
        put("bg","EEE d MMM");
        put("bg_BG","EEE d MMM");
        put("bm","EEE d MMM");
        put("bm_ML","EEE d MMM");
        put("bn","EEE d MMM");
        put("bn_BD","EEE d MMM");
        put("bn_IN","EEE d MMM");
        put("bo","MMMའི་ཚེས་d EEE");
        put("bo_CN","MMMའི་ཚེས་d EEE");
        put("bo_IN","MMMའི་ཚེས་d EEE");
        put("br","EEE d MMM");
        put("br_FR","EEE d MMM");
        put("brx","EEE MMM d");
        put("brx_IN","EEE MMM d");
        put("bs","EEE d. MMM ");
        put("bs_Cyrl","EEE dd. MMM ");
        put("bs_Cyrl_BA","EEE dd. MMM ");
        put("bs_Latn","EEE d. MMM ");
        put("bs_Latn_BA","EEE d. MMM ");
        put("ca","EEE d MMM");
        put("ca_AD","EEE d MMM");
        put("ca_ES","EEE d MMM");
        put("ca_FR","EEE d MMM");
        put("ca_IT","EEE d MMM");
        put("ccp","EEE d MMM");
        put("ccp_BD","EEE d MMM");
        put("ccp_IN","EEE d MMM");
        put("ce","MMM d EEE");
        put("ce_RU","MMM d EEE");
        put("cgg","EEE d MMM");
        put("cgg_UG","EEE d MMM");
        put("chr","EEE MMM d");
        put("chr_US","EEE MMM d");
        put("ckb","MMM d EEE");
        put("ckb_IQ","MMM d EEE");
        put("ckb_IR","MMM d EEE");
        put("cs","EEE d. MMM");
        put("cs_CZ","EEE d. MMM");
        put("cy","EEE d MMM");
        put("cy_GB","EEE d MMM");
        put("da","EEE 'den' d. MMM");
        put("da_DK","EEE 'den' d. MMM");
        put("da_GL","EEE 'den' d. MMM");
        put("dav","EEE d MMM");
        put("dav_KE","EEE d MMM");
        put("de","EEE d. MMM");
        put("de_AT","EEE d. MMM");
        put("de_BE","EEE d. MMM");
        put("de_CH","EEE d. MMM");
        put("de_DE","EEE d. MMM");
        put("de_IT","EEE d. MMM");
        put("de_LI","EEE d. MMM");
        put("de_LU","EEE d. MMM");
        put("dje","EEE d MMM");
        put("dje_NE","EEE d MMM");
        put("dsb","EEE d. MMM");
        put("dsb_DE","EEE d. MMM");
        put("dua","EEE d MMM");
        put("dua_CM","EEE d MMM");
        put("dyo","EEE d MMM");
        put("dyo_SN","EEE d MMM");
        put("dz","EEE MMM ཚེས་dd");
        put("dz_BT","EEE MMM ཚེས་dd");
        put("ebu","EEE d MMM");
        put("ebu_KE","EEE d MMM");
        put("ee","EEE MMM d");
        put("ee_GH","EEE MMM d");
        put("ee_TG","EEE MMM d");
        put("el","EEE d MMM");
        put("el_CY","EEE d MMM");
        put("el_GR","EEE d MMM");
        put("en","EEE MMM d");
        put("en_001","EEE d MMM");
        put("en_150","EEE d MMM");
        put("en_AG","EEE d MMM");
        put("en_AI","EEE d MMM");
        put("en_AS","EEE MMM d");
        put("en_AT","EEE d MMM");
        put("en_AU","EEE d MMM");
        put("en_BB","EEE d MMM");
        put("en_BE","EEE d MMM");
        put("en_BI","EEE MMM d");
        put("en_BM","EEE d MMM");
        put("en_BS","EEE d MMM");
        put("en_BW","EEE dd MMM");
        put("en_BZ","EEE dd MMM");
        put("en_CA","EEE MMM d");
        put("en_CC","EEE d MMM");
        put("en_CH","EEE d MMM");
        put("en_CK","EEE d MMM");
        put("en_CM","EEE d MMM");
        put("en_CX","EEE d MMM");
        put("en_CY","EEE d MMM");
        put("en_DE","EEE d MMM");
        put("en_DG","EEE d MMM");
        put("en_DK","EEE d MMM");
        put("en_DM","EEE d MMM");
        put("en_ER","EEE d MMM");
        put("en_FI","EEE d MMM");
        put("en_FJ","EEE d MMM");
        put("en_FK","EEE d MMM");
        put("en_FM","EEE d MMM");
        put("en_GB","EEE d MMM");
        put("en_GD","EEE d MMM");
        put("en_GG","EEE d MMM");
        put("en_GH","EEE d MMM");
        put("en_GI","EEE d MMM");
        put("en_GM","EEE d MMM");
        put("en_GU","EEE MMM d");
        put("en_GY","EEE d MMM");
        put("en_HK","EEE d MMM");
        put("en_IE","EEE d MMM");
        put("en_IL","EEE d MMM");
        put("en_IM","EEE d MMM");
        put("en_IN","EEE d MMM");
        put("en_IO","EEE d MMM");
        put("en_JE","EEE d MMM");
        put("en_JM","EEE d MMM");
        put("en_KE","EEE d MMM");
        put("en_KI","EEE d MMM");
        put("en_KN","EEE d MMM");
        put("en_KY","EEE d MMM");
        put("en_LC","EEE d MMM");
        put("en_LR","EEE d MMM");
        put("en_LS","EEE d MMM");
        put("en_MG","EEE d MMM");
        put("en_MH","EEE MMM d");
        put("en_MO","EEE d MMM");
        put("en_MP","EEE MMM d");
        put("en_MS","EEE d MMM");
        put("en_MT","EEE d MMM");
        put("en_MU","EEE d MMM");
        put("en_MW","EEE d MMM");
        put("en_MY","EEE d MMM");
        put("en_NA","EEE d MMM");
        put("en_NF","EEE d MMM");
        put("en_NG","EEE d MMM");
        put("en_NL","EEE d MMM");
        put("en_NR","EEE d MMM");
        put("en_NU","EEE d MMM");
        put("en_NZ","EEE d MMM");
        put("en_PG","EEE d MMM");
        put("en_PH","EEE d MMM");
        put("en_PK","EEE d MMM");
        put("en_PN","EEE d MMM");
        put("en_PR","EEE MMM d");
        put("en_PW","EEE d MMM");
        put("en_RW","EEE d MMM");
        put("en_SB","EEE d MMM");
        put("en_SC","EEE d MMM");
        put("en_SD","EEE d MMM");
        put("en_SE","EEE d MMM");
        put("en_SG","EEE d MMM");
        put("en_SH","EEE d MMM");
        put("en_SI","EEE d MMM");
        put("en_SL","EEE d MMM");
        put("en_SS","EEE d MMM");
        put("en_SX","EEE d MMM");
        put("en_SZ","EEE d MMM");
        put("en_TC","EEE d MMM");
        put("en_TK","EEE d MMM");
        put("en_TO","EEE d MMM");
        put("en_TT","EEE d MMM");
        put("en_TV","EEE d MMM");
        put("en_TZ","EEE d MMM");
        put("en_UG","EEE d MMM");
        put("en_UM","EEE MMM d");
        put("en_US","EEE MMM d");
        put("en_US_POSIX","EEE MMM d");
        put("en_VC","EEE d MMM");
        put("en_VG","EEE d MMM");
        put("en_VI","EEE MMM d");
        put("en_VU","EEE d MMM");
        put("en_WS","EEE d MMM");
        put("en_XA","[EEE MMM d]");
        put("en_ZA","EEE dd MMM");
        put("en_ZM","EEE d MMM");
        put("en_ZW","EEE dd MMM");
        put("eo","EEE d_'a' 'de' MMM");
        put("es","EEE d 'de' MMM");
        put("es_419","EEE d 'de' MMM");
        put("es_AR","EEE d 'de' MMM");
        put("es_BO","EEE d 'de' MMM");
        put("es_BR","EEE d 'de' MMM");
        put("es_BZ","EEE d 'de' MMM");
        put("es_CL","EEE d 'de' MMM");
        put("es_CO","EEE d 'de' MMM");
        put("es_CR","EEE d 'de' MMM");
        put("es_CU","EEE d 'de' MMM");
        put("es_DO","EEE d 'de' MMM");
        put("es_EA","EEE d 'de' MMM");
        put("es_EC","EEE d 'de' MMM");
        put("es_ES","EEE d 'de' MMM");
        put("es_GQ","EEE d 'de' MMM");
        put("es_GT","EEE d 'de' MMM");
        put("es_HN","EEE dd 'de' MMM");
        put("es_IC","EEE d 'de' MMM");
        put("es_MX","EEE d 'de' MMM");
        put("es_NI","EEE d 'de' MMM");
        put("es_PA","EEE d 'de' MMM");
        put("es_PE","EEE d 'de' MMM");
        put("es_PH","EEE d 'de' MMM");
        put("es_PR","EEE d 'de' MMM");
        put("es_PY","EEE d 'de' MMM");
        put("es_SV","EEE d 'de' MMM");
        put("es_US","EEE d 'de' MMM");
        put("es_UY","EEE d 'de' MMM");
        put("es_VE","EEE d 'de' MMM");
        put("et","EEE d. MMM");
        put("et_EE","EEE d. MMM");
        put("eu","MMM d EEE");
        put("eu_ES","MMM d EEE");
        put("ewo","EEE d MMM");
        put("ewo_CM","EEE d MMM");
        put("fa","EEE d MMM");
        put("fa_AF","EEE d MMM");
        put("fa_IR","EEE d MMM");
        put("ff","EEE d MMM");
        put("fi","EEE d. MMM");
        put("fi_FI","EEE d. MMM");
        put("fil","EEE MMM d");
        put("fil_PH","EEE MMM d");
        put("fo","EEE d. MMM");
        put("fo_DK","EEE d. MMM");
        put("fo_FO","EEE d. MMM");
        put("fr","EEE d MMM");
        put("fr_BE","EEE d MMM");
        put("fr_BF","EEE d MMM");
        put("fr_BI","EEE d MMM");
        put("fr_BJ","EEE d MMM");
        put("fr_BL","EEE d MMM");
        put("fr_CA","EEE d MMM");
        put("fr_CD","EEE d MMM");
        put("fr_CF","EEE d MMM");
        put("fr_CG","EEE d MMM");
        put("fr_CH","EEE d MMM");
        put("fr_CI","EEE d MMM");
        put("fr_CM","EEE d MMM");
        put("fr_DJ","EEE d MMM");
        put("fr_DZ","EEE d MMM");
        put("fr_FR","EEE d MMM");
        put("fr_GA","EEE d MMM");
        put("fr_GF","EEE d MMM");
        put("fr_GN","EEE d MMM");
        put("fr_GP","EEE d MMM");
        put("fr_GQ","EEE d MMM");
        put("fr_HT","EEE d MMM");
        put("fr_KM","EEE d MMM");
        put("fr_LU","EEE d MMM");
        put("fr_MA","EEE d MMM");
        put("fr_MC","EEE d MMM");
        put("fr_MF","EEE d MMM");
        put("fr_MG","EEE d MMM");
        put("fr_ML","EEE d MMM");
        put("fr_MQ","EEE d MMM");
        put("fr_MR","EEE d MMM");
        put("fr_MU","EEE d MMM");
        put("fr_NC","EEE d MMM");
        put("fr_NE","EEE d MMM");
        put("fr_PF","EEE d MMM");
        put("fr_PM","EEE d MMM");
        put("fr_RE","EEE d MMM");
        put("fr_RW","EEE d MMM");
        put("fr_SC","EEE d MMM");
        put("fr_SN","EEE d MMM");
        put("fr_SY","EEE d MMM");
        put("fr_TD","EEE d MMM");
        put("fr_TG","EEE d MMM");
        put("fr_TN","EEE d MMM");
        put("fr_VU","EEE d MMM");
        put("fr_WF","EEE d MMM");
        put("fr_YT","EEE d MMM");
        put("fur","EEE d 'di' MMM");
        put("fur_IT","EEE d 'di' MMM");
        put("fy","EEE d MMM");
        put("fy_NL","EEE d MMM");
        put("ga","EEE d MMM");
        put("ga_IE","EEE d MMM");
        put("gd","EEE d'mh' MMM");
        put("gd_GB","EEE d'mh' MMM");
        put("gl","EEE d 'de' MMM");
        put("gl_ES","EEE d 'de' MMM");
        put("gsw","EEE d. MMM");
        put("gsw_CH","EEE d. MMM");
        put("gsw_FR","EEE d. MMM");
        put("gsw_LI","EEE d. MMM");
        put("gu","EEE d MMM");
        put("gu_IN","EEE d MMM");
        put("guz","EEE d MMM");
        put("guz_KE","EEE d MMM");
        put("gv","MMM d EEE");
        put("gv_IM","MMM d EEE");
        put("ha","EEE d MMM");
        put("ha_GH","EEE d MMM");
        put("ha_NE","EEE d MMM");
        put("ha_NG","EEE d MMM");
        put("haw","EEE d MMM");
        put("haw_US","EEE d MMM");
        put("he","EEE d בMMM");
        put("he_IL","EEE d בMMM");
        put("hi","EEE d MMM");
        put("hi_IN","EEE d MMM");
        put("hr","EEE d. MMM ");
        put("hr_BA","EEE d. MMM ");
        put("hr_HR","EEE d. MMM ");
        put("hsb","EEE d. MMM");
        put("hsb_DE","EEE d. MMM");
        put("hu","MMM d. EEE");
        put("hu_HU","MMM d. EEE");
        put("hy","MMM d EEE");
        put("hy_AM","MMM d EEE");
        put("ia","EEE 'le' d 'de' MMM");
        put("ia_001","EEE 'le' d 'de' MMM");
        put("id","EEE dd MMM");
        put("id_ID","EEE dd MMM");
        put("ig","EEE d MMM");
        put("ig_NG","EEE d MMM");
        put("ii","MMM d EEE");
        put("ii_CN","MMM d EEE");
        put("is","EEE d. MMM");
        put("is_IS","EEE d. MMM");
        put("it","EEE d MMM");
        put("it_CH","EEE d MMM");
        put("it_IT","EEE d MMM");
        put("it_SM","EEE d MMM");
        put("it_VA","EEE d MMM");
        put("ja","M月d日EEE");
        put("ja_JP","M月d日EEE");
        put("jgo","EEE MMM dd");
        put("jgo_CM","EEE MMM dd");
        put("jmc","EEE d MMM");
        put("jmc_TZ","EEE d MMM");
        put("jv","EEE d MMM");
        put("jv_ID","EEE d MMM");
        put("ka","EEE dd MMM");
        put("ka_GE","EEE dd MMM");
        put("kab","EEE d MMM");
        put("kab_DZ","EEE d MMM");
        put("kam","EEE d MMM");
        put("kam_KE","EEE d MMM");
        put("kde","EEE d MMM");
        put("kde_TZ","EEE d MMM");
        put("kea","EEE d 'di' MMM");
        put("kea_CV","EEE d 'di' MMM");
        put("khq","EEE d MMM");
        put("khq_ML","EEE d MMM");
        put("ki","EEE d MMM");
        put("ki_KE","EEE d MMM");
        put("kk","d MMM EEE");
        put("kk_KZ","d MMM EEE");
        put("kkj","EEE dd MMM");
        put("kkj_CM","EEE dd MMM");
        put("kl","MMM d EEE");
        put("kl_GL","MMM d EEE");
        put("kln","EEE d MMM");
        put("kln_KE","EEE d MMM");
        put("km","EEE d MMM");
        put("km_KH","EEE d MMM");
        put("kn","EEE MMM d");
        put("kn_IN","EEE MMM d");
        put("ko","M월 d일 EEE");
        put("ko_KP","M월 d일 EEE");
        put("ko_KR","M월 d일 EEE");
        put("kok","EEE d MMM");
        put("kok_IN","EEE d MMM");
        put("ks","EEE MMM d");
        put("ks_IN","EEE MMM d");
        put("ksb","EEE d MMM");
        put("ksb_TZ","EEE d MMM");
        put("ksf","EEE d MMM");
        put("ksf_CM","EEE d MMM");
        put("ksh","EEE 'dä' d. MMM");
        put("ksh_DE","EEE 'dä' d. MMM");
        put("ku","MMM d EEE");
        put("ku_TR","MMM d EEE");
        put("kw","MMM d EEE");
        put("kw_GB","MMM d EEE");
        put("ky","d_MMM EEE");
        put("ky_KG","d_MMM EEE");
        put("lag","EEE d MMM");
        put("lag_TZ","EEE d MMM");
        put("lb","EEE d. MMM");
        put("lb_LU","EEE d. MMM");
        put("lg","EEE d MMM");
        put("lg_UG","EEE d MMM");
        put("lkt","MMM d EEE");
        put("lkt_US","MMM d EEE");
        put("ln","EEE d MMM");
        put("ln_AO","EEE d MMM");
        put("ln_CD","EEE d MMM");
        put("ln_CF","EEE d MMM");
        put("ln_CG","EEE d MMM");
        put("lo","EEE ທີ d MMM");
        put("lo_LA","EEE ທີ d MMM");
        put("lrc","MMM d EEE");
        put("lrc_IQ","MMM d EEE");
        put("lrc_IR","MMM d EEE");
        put("lt","MMM d 'd'. EEE");
        put("lt_LT","MMM d 'd'. EEE");
        put("lu","EEE d MMM");
        put("lu_CD","EEE d MMM");
        put("luo","EEE d MMM");
        put("luo_KE","EEE d MMM");
        put("luy","EEE d MMM");
        put("luy_KE","EEE d MMM");
        put("lv","EEE 'gada' d. MMM");
        put("lv_LV","EEE 'gada' d. MMM");
        put("mas","EEE d MMM");
        put("mas_KE","EEE d MMM");
        put("mas_TZ","EEE d MMM");
        put("mer","EEE d MMM");
        put("mer_KE","EEE d MMM");
        put("mfe","EEE d MMM");
        put("mfe_MU","EEE d MMM");
        put("mg","EEE d MMM");
        put("mg_MG","EEE d MMM");
        put("mgh","EEE d MMM");
        put("mgh_MZ","EEE d MMM");
        put("mgo","EEE MMM dd");
        put("mgo_CM","EEE MMM dd");
        put("mi","MMM d EEE");
        put("mi_NZ","MMM d EEE");
        put("mk","EEE dd MMM");
        put("mk_MK","EEE dd MMM");
        put("ml","MMM d EEE");
        put("ml_IN","MMM d EEE");
        put("mn","MM.dd EEE");
        put("mn_MN","MM.dd EEE");
        put("mr","EEE d MMM");
        put("mr_IN","EEE d MMM");
        put("ms","EEE d MMM");
        put("ms_BN","dd MMM");
        put("ms_MY","EEE d MMM");
        put("ms_SG","EEE d MMM");
        put("mt","EEE d 'ta'’ MMM");
        put("mt_MT","EEE d 'ta'’ MMM");
        put("mua","EEE d MMM");
        put("mua_CM","EEE d MMM");
        put("my","၊ MMM d၊ EEE");
        put("my_MM","၊ MMM d၊ EEE");
        put("mzn","MMM d EEE");
        put("mzn_IR","MMM d EEE");
        put("naq","EEE d MMM");
        put("naq_NA","EEE d MMM");
        put("nb","EEE d. MMM");
        put("nb_NO","EEE d. MMM");
        put("nb_SJ","EEE d. MMM");
        put("nd","EEE d MMM");
        put("nd_ZW","EEE d MMM");
        put("nds","MMM d EEE");
        put("nds_DE","MMM d EEE");
        put("nds_NL","MMM d EEE");
        put("ne","MMM d EEE");
        put("ne_IN","MMM d EEE");
        put("ne_NP","MMM d EEE");
        put("nl","EEE d MMM");
        put("nl_AW","EEE d MMM");
        put("nl_BE","EEE d MMM");
        put("nl_BQ","EEE d MMM");
        put("nl_CW","EEE d MMM");
        put("nl_NL","EEE d MMM");
        put("nl_SR","EEE d MMM");
        put("nl_SX","EEE d MMM");
        put("nmg","EEE d MMM");
        put("nmg_CM","EEE d MMM");
        put("nn","EEE d. MMM");
        put("nn_NO","EEE d. MMM");
        put("nnh","EEE 'lyɛ'̌ʼ d 'na' MMM");
        put("nnh_CM","EEE 'lyɛ'̌ʼ d 'na' MMM");
        put("nus","EEE d MMM");
        put("nus_SS","EEE d MMM");
        put("nyn","EEE d MMM");
        put("nyn_UG","EEE d MMM");
        put("om","EEE MMM d");
        put("om_ET","EEE MMM d");
        put("om_KE","EEE MMM d");
        put("or","EEE MMM d");
        put("or_IN","EEE MMM d");
        put("os","EEE d MMM");
        put("os_GE","EEE d MMM");
        put("os_RU","EEE d MMM");
        put("pa","EEE d MMM");
        put("pa_Arab","EEE dd MMM");
        put("pa_Arab_PK","EEE dd MMM");
        put("pa_Guru","EEE d MMM");
        put("pa_Guru_IN","EEE d MMM");
        put("pl","EEE d MMM");
        put("pl_PL","EEE d MMM");
        put("ps","EEE MMM d");
        put("ps_AF","EEE MMM d");
        put("pt","EEE d 'de' MMM");
        put("pt_AO","EEE d 'de' MMM");
        put("pt_BR","EEE d 'de' MMM");
        put("pt_CH","EEE d 'de' MMM");
        put("pt_CV","EEE d 'de' MMM");
        put("pt_GQ","EEE d 'de' MMM");
        put("pt_GW","EEE d 'de' MMM");
        put("pt_LU","EEE d 'de' MMM");
        put("pt_MO","EEE d 'de' MMM");
        put("pt_MZ","EEE d 'de' MMM");
        put("pt_PT","EEE d 'de' MMM");
        put("pt_ST","EEE d 'de' MMM");
        put("pt_TL","EEE d 'de' MMM");
        put("qu","EEE d MMM");
        put("qu_BO","EEE d MMM");
        put("qu_EC","EEE d MMM");
        put("qu_PE","EEE d MMM");
        put("rm","EEE d MMM");
        put("rm_CH","EEE d MMM");
        put("rn","EEE d MMM");
        put("rn_BI","EEE d MMM");
        put("ro","EEE d MMM");
        put("ro_MD","EEE d MMM");
        put("ro_RO","EEE d MMM");
        put("rof","EEE d MMM");
        put("rof_TZ","EEE d MMM");
        put("ru","EEE d MMM");
        put("ru_BY","EEE d MMM");
        put("ru_KG","EEE d MMM");
        put("ru_KZ","EEE d MMM");
        put("ru_MD","EEE d MMM");
        put("ru_RU","EEE d MMM");
        put("ru_UA","EEE d MMM");
        put("rw","MMM d EEE");
        put("rw_RW","MMM d EEE");
        put("rwk","EEE d MMM");
        put("rwk_TZ","EEE d MMM");
        put("sah","MMM d EEE");
        put("sah_RU","MMM d EEE");
        put("saq","EEE d MMM");
        put("saq_KE","EEE d MMM");
        put("sbp","EEE d MMM");
        put("sbp_TZ","EEE d MMM");
        put("sd","MMM d EEE");
        put("sd_PK","MMM d EEE");
        put("se","MMM d EEE");
        put("se_FI","EEE d MMM");
        put("se_NO","MMM d EEE");
        put("se_SE","MMM d EEE");
        put("seh","EEE d 'de' MMM");
        put("seh_MZ","EEE d 'de' MMM");
        put("ses","EEE d MMM");
        put("ses_ML","EEE d MMM");
        put("sg","EEE d MMM");
        put("sg_CF","EEE d MMM");
        put("shi","EEE d MMM");
        put("shi_Latn","EEE d MMM");
        put("shi_Latn_MA","EEE d MMM");
        put("shi_Tfng","EEE d MMM");
        put("shi_Tfng_MA","EEE d MMM");
        put("si","MMM d EEE");
        put("si_LK","MMM d EEE");
        put("sk","EEE d. MMM");
        put("sk_SK","EEE d. MMM");
        put("sl","EEE dd. MMM");
        put("sl_SI","EEE dd. MMM");
        put("smn","EEE MMM d.");
        put("smn_FI","EEE MMM d.");
        put("sn","MMM d EEE");
        put("sn_ZW","MMM d EEE");
        put("so","EEE MMM dd");
        put("so_DJ","EEE MMM dd");
        put("so_ET","EEE MMM dd");
        put("so_KE","EEE MMM dd");
        put("so_SO","EEE MMM dd");
        put("sq","EEE d MMM");
        put("sq_AL","EEE d MMM");
        put("sq_MK","EEE d MMM");
        put("sq_XK","EEE d MMM");
        put("sr","EEE dd. MMM ");
        put("sr_Cyrl","EEE dd. MMM ");
        put("sr_Cyrl_BA","EEE dd. MMM ");
        put("sr_Cyrl_ME","EEE dd. MMM ");
        put("sr_Cyrl_RS","EEE dd. MMM ");
        put("sr_Cyrl_XK","EEE dd. MMM ");
        put("sr_Latn","EEE dd. MMM ");
        put("sr_Latn_BA","EEE dd. MMM ");
        put("sr_Latn_ME","EEE dd. MMM ");
        put("sr_Latn_RS","EEE dd. MMM ");
        put("sr_Latn_XK","EEE dd. MMM ");
        put("sv","EEE d MMM");
        put("sv_AX","EEE d MMM");
        put("sv_FI","EEE d MMM");
        put("sv_SE","EEE d MMM");
        put("sw","EEE d MMM");
        put("sw_CD","EEE d MMM");
        put("sw_KE","EEE d MMM");
        put("sw_TZ","EEE d MMM");
        put("sw_UG","EEE d MMM");
        put("ta","EEE d MMM");
        put("ta_IN","EEE d MMM");
        put("ta_LK","EEE d MMM");
        put("ta_MY","EEE d MMM");
        put("ta_SG","EEE d MMM");
        put("te","d MMM EEE");
        put("te_IN","d MMM EEE");
        put("teo","EEE d MMM");
        put("teo_KE","EEE d MMM");
        put("teo_UG","EEE d MMM");
        put("tg","EEE dd MMM");
        put("tg_TJ","EEE dd MMM");
        put("th","EEEที่ d MMM");
        put("th_TH","EEEที่ d MMM");
        put("ti","EEE፣ dd MMM");
        put("ti_ER","EEE፣ dd MMM");
        put("ti_ET","EEE፣ dd MMM");
        put("tk","d MMM EEE");
        put("tk_TM","d MMM EEE");
        put("to","EEE d MMM");
        put("to_TO","EEE d MMM");
        put("tr","d MMM EEE");
        put("tr_CY","d MMM EEE");
        put("tr_TR","d MMM EEE");
        put("tt","d MMM EEE");
        put("tt_RU","d MMM EEE");
        put("twq","EEE d MMM");
        put("twq_NE","EEE d MMM");
        put("tzm","EEE d MMM");
        put("tzm_MA","EEE d MMM");
        put("ug","d_MMM، EEE");
        put("ug_CN","d_MMM، EEE");
        put("uk","EEE d MMM ");
        put("uk_UA","EEE d MMM ");
        put("ur","EEE، d MMM،");
        put("ur_IN","EEE، d MMM،");
        put("ur_PK","EEE، d MMM،");
        put("uz","EEE d_MMM");
        put("uz_Arab","EEE d_MMM");
        put("uz_Arab_AF","EEE d_MMM");
        put("uz_Cyrl","EEE dd MMM");
        put("uz_Cyrl_UZ","EEE dd MMM");
        put("uz_Latn","EEE d_MMM");
        put("uz_Latn_UZ","EEE d_MMM");
        put("vai","EEE d MMM");
        put("vai_Latn","EEE d MMM");
        put("vai_Latn_LR","EEE d MMM");
        put("vai_Vaii","EEE d MMM");
        put("vai_Vaii_LR","EEE d MMM");
        put("vi","EEE d MMM");
        put("vi_VN","EEE d MMM");
        put("vun","EEE d MMM");
        put("vun_TZ","EEE d MMM");
        put("wae","EEE d. MMM");
        put("wae_CH","EEE d. MMM");
        put("wo","EEE d MMM");
        put("wo_SN","EEE d MMM");
        put("xh","MMM d EEE");
        put("xh_ZA","MMM d EEE");
        put("xog","EEE d MMM");
        put("xog_UG","EEE d MMM");
        put("yav","EEE d MMM");
        put("yav_CM","EEE d MMM");
        put("yi","EEE dטן MMM");
        put("yi_001","EEE dטן MMM");
        put("yo","EEE d MMM");
        put("yo_BJ","EEE d MMM");
        put("yo_NG","EEE d MMM");
        put("yue","M月d日 EEE");
        put("yue_Hans","M月d日EEE");
        put("yue_Hans_CN","M月d日EEE");
        put("yue_Hant","M月d日 EEE");
        put("yue_Hant_HK","M月d日 EEE");
        put("zgh","EEE d MMM");
        put("zgh_MA","EEE d MMM");
        put("zh","M月d日EEE");
        put("zh_CN","M月d日EEE");
        put("zh_CH","M月d日EEE");
        put("zh_HK","M月d日EEE");
        put("zh_MO","M月d日EEE");
        put("zh_SG","M月d日EEE");
        put("zh_Hans","M月d日EEE");
        put("zh_Hans_CN","M月d日EEE");
        put("zh_Hans_HK","M月d日EEE");
        put("zh_Hans_MO","M月d日EEE");
        put("zh_Hans_SG","M月d日EEE");
        put("zh_Hant", "M月d日EEE");
        put("zh_Hant_HK","M月d日EEE");
        put("zh_Hant_MO","M月d日EEE");
        put("zh_Hant_TW","M月d日EEE");
        put("zu","EEE MMM d");
        put("zu_ZA","EEE MMM d");
    }};

}
