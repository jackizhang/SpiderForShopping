package com.zhy.spider.test;

import java.util.List;

import com.zhy.spider.bean.LinkTypeData;
import com.zhy.spider.core.ExtractService;
import com.zhy.spider.rule.Rule;

public class TT {
	public static void main(String[] args) {
		String url = "https://search.jd.com/Search";
		String[] keys = { "keyword", "enc", "wq" };
		String[] values = { "手机", "utf-8", "手机" };
		String select = "li.gl-item";
		Rule rule = new Rule(url, keys, values, select, 2, Rule.GET);
		List<LinkTypeData> extracts = ExtractService.extract(rule);
		// printf(extracts);
	}

	public static void printf(List<LinkTypeData> datas) {
		for (LinkTypeData data : datas) {
			System.out.println(data.getLinkText());
			System.out.println(data.getLinkHref());
			System.out.println("***********************************");
		}

	}
}
