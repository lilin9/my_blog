import Vue from 'vue'
import Vuex from 'vuex'
// import * as getters from './getters.js'

Vue.use(Vuex)

/** 状态定义 */
export const state = {
  loading: false,
  themeObj: 0,//主题
  keywords:'',//关键词
  errorImg: 'this.onerror=null;this.src="' + require('../../static/img/tou.jpg') + '"',
  // baseURL:'http://localhost:8080/api'
  baseURL:'http://47.120.7.212:8080/api'
}

export default new Vuex.Store({
    state,
})
