package com.sbb.flexrate;

import com.sbb.flexrate.repository.DashboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MainService {
    private final DashboardRepository dashboardRepository;
}
