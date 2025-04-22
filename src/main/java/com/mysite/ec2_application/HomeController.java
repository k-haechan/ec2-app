package com.mysite.ec2_application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;

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
	private final S3Client s3Client;

	@Value("${custom.secretWord}")
	private String secretWord;

	@GetMapping("/")
	public String home() {
		return "secretWord : " + secretWord;
	}

	@GetMapping("/buckets")
	public List<String> listAllBuckets() {
		return s3Client
			.listBuckets()
			.buckets()
			.stream()
			.map(Bucket::name)
			.collect(Collectors.toList());
	}
}
