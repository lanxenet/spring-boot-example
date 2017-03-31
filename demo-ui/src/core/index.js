/*
 * Copyright 2016 Inspireso and/or its affiliates.
 * Licensed under the MIT License.
 */

var jquery = require('jquery');

module.exports = {
  initState: require('./StateManager'),
  extend: jquery.extend,
  Promise: jquery.Deferred(),
  when: jquery.when,
  isFunction: jquery.isFunction,
  addClass: function (selector, classes) {
    jquery(selector).addClass(classes);
  },
  removeClass: function (selector, classes) {
    jquery(selector).removeClass(classes);
  },
};
