package com.shopeasyfy.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shopeasyfy.entity.Setting;
import com.shopeasyfy.entity.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
    public List<Setting> findByCategory(SettingCategory category);
  
}
