package ynu.mediinsight.MediInsightBackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ynu.mediinsight.MediInsightBackend.entity.po.Registration;

import java.util.List;

public interface RegistrationService extends IService<Registration> {
    List<Registration> getAllWaitingRegistration();

    List<Registration> getRegistrationHistoryByPatientId(int id);
}
