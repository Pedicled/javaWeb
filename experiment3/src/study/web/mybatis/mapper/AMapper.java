package study.web.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import study.web.mybatis.pojo.Animal;

public interface AMapper {

	@Select("select a_id as id,a_type as type,a_legs as legs from animal")
	public List<Animal> allAnimal();
}
