/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jiangxindc.data.jdbc.controller;

import com.jiangxindc.data.jdbc.dao.UserRepository;
import com.jiangxindc.data.jdbc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author AnQi
 */
@Controller
public class SampleController {

	private final UserRepository userRepository;

	public SampleController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<User> customers(@RequestParam String name) {
		return this.userRepository.findByName(name);
	}

}
