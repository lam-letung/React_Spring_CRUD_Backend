package com.lamlt15.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.lamlt15.model.User;

public interface UserService {

	<S extends User> List<S> findAll(Example<S> example, Sort sort);

	<S extends User> List<S> findAll(Example<S> example);

	void deleteAll();

	User getReferenceById(Long id);

	void deleteAll(Iterable<? extends User> entities);

	void deleteAllById(Iterable<? extends Long> ids);

	User getById(Long id);

	void delete(User entity);

	User getOne(Long id);

	void deleteById(Long id);

	void deleteAllInBatch();

	long count();

	<S extends User, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	<S extends User> boolean exists(Example<S> example);

	void deleteAllInBatch(Iterable<User> entities);

	<S extends User> long count(Example<S> example);

	boolean existsById(Long id);

	void deleteInBatch(Iterable<User> entities);

	Optional<User> findById(Long id);

	<S extends User> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends User> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends User> S saveAndFlush(S entity);

	void flush();

	<S extends User> List<S> saveAll(Iterable<S> entities);

	List<User> findAllById(Iterable<Long> ids);

	List<User> findAll(Sort sort);

	Page<User> findAll(Pageable pageable);

	List<User> findAll();

	<S extends User> Optional<S> findOne(Example<S> example);

	<S extends User> S save(S entity);

}
