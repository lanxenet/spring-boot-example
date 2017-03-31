/*
 * Copyright (c) 2015, Inspireso and/or its affiliates. All rights reserved.
 */

'use strict';

const {Promise, extend} = require('../core');
const {build, fetch} = require('./fetch');

const user = {
  url: function (...path) {
    return build(path && path.length ? '/user/' + path.join("/") : '/user');
  },

  findAll: function (query) {
    let url = this.url();
    return fetch(url, {
      method: "GET",
      data: query
    });

  },

  find: function (id) {
    let url = this.url(id);
    return fetch(url, {
      method: "GET"
    });

  },

  save: function (data) {
    let url = this.url();
    return fetch(url, {
      type: "POST",
      data: data
    });
  },

  delete: function (id) {
    let url = this.url(id);
    return fetch(url, {
      type: "DELETE"
    });
  }

};


module.exports = {
  user: user
};
