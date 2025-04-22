package com.mysite.ec2_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * PackageName : com.mysite.ec2_application
 * FileName    : HomeController
 * Author      : hc
 * Date        : 25. 4. 22.
 * Description : 
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 25. 4. 22.     hc               Initial creation
 */
@RestController
@RequiredArgsConstructor
public class HomeController {
	// private final S3Client s3Client;

	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

	// @GetMapping("/buckets")
	// public List<String> listAllBuckets() {
	// 	return s3Client
	// 		.listBuckets()
	// 		.buckets()
	// 		.stream()
	// 		.map(Bucket::name)
	// 		.collect(Collectors.toList());
	// }
}
