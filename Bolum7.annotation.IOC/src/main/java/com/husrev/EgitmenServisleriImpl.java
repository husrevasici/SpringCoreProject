package com.husrev;

import org.springframework.stereotype.Component;

@Component
public class EgitmenServisleriImpl implements EgitmenServisleri{

	@Override
	public int ucretTeklifiVer() {
		  return 1000;
	}

}
