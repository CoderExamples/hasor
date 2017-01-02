/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.web;
import java.lang.reflect.Method;
/**
 * @version : 2016-12-26
 * @author 赵永春 (zyc@hasor.net)
 */
public interface MappingData {
    /**
     * 获取目标类型
     */
    public Class<?> getTargetType();

    /** 获取映射的地址 */
    public String getMappingTo();

    /** 获取方法 */
    public Method[] getMethods();

    /**
     * 测试路径是否匹配。
     * @return 返回测试结果。
     */
    public boolean matchingMapping(Invoker invoker);
    //    public String getMappingToMatches();
    //    /** 查找调用方法 */
    //    public Method findMethod(Invoker invoker);
    //    /** 是否为异步 */
    //    public boolean isAsync(Invoker invoker);
}