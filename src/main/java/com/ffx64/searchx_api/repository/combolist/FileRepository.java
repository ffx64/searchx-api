package com.ffx64.searchx_api.repository.combolist;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ffx64.searchx_api.entity.combolist.FileEntity;

@Repository("combolistFileRepository")
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    
    List<FileEntity> findByStatus(Integer status);

    List<FileEntity> findByCreatedAt(Date createdAt);

    List<FileEntity> findByAgentKey(String agentKey);
    
    FileEntity findByHash(String hash);
}
